package mzx.kpartify.view

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import kotlinx.android.synthetic.main.bands_fragment.*
import mzx.kpartify.KPartifyApp
import mzx.kpartify.R
import mzx.kpartify.adapter.BandListAdapter
import mzx.kpartify.api.Band
import mzx.kpartify.api.FirebaseService
import mzx.kpartify.common.inflate
import javax.inject.Inject

/**
 * Created by mauricioheredia on 29/09/16.
 */
class BandsFragment : Fragment() {

    private val adapter = BandListAdapter()

    @Inject
    lateinit var firebaseService: FirebaseService

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return container?.inflate(R.layout.bands_fragment)!!
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        KPartifyApp.newsComponent.inject(this)
        band_recycler_view.apply {
            setHasFixedSize(true)
            val linearLayout = LinearLayoutManager(context)
            layoutManager = linearLayout
//            clearOnScrollListeners()
//            addOnScrollListener(InfiniteScrollListener({ requestNews() }, linearLayout))
        }

        var postListener: ChildEventListener = object : ChildEventListener {
            override fun onChildAdded(dataSnapshot: DataSnapshot?, p1: String?) {
                if (dataSnapshot != null) {
                    var band = dataSnapshot.getValue(Band::class.java)
                    adapter.addBand(band)
                }
            }

            override fun onChildChanged(p0: DataSnapshot?, p1: String?) {

            }

            override fun onChildMoved(p0: DataSnapshot?, p1: String?) {
                throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onChildRemoved(p0: DataSnapshot?) {
                throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onCancelled(databaseError: DatabaseError?) {
                print(databaseError)

            }
        }
        band_recycler_view.adapter = adapter
        firebaseService.getDatabaseReference().addChildEventListener(postListener)
    }
}