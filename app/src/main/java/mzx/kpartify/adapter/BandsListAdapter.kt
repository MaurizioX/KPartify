package mzx.kpartify.adapter

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import mzx.kpartify.api.Band
import java.util.*

/**
 * Created by mauricioheredia on 29/09/16.
 */

class BandListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: ArrayList<ViewType>
    private var delegateAdapters = SparseArrayCompat<ViewTypeDelegateAdapter>()

    init {

        delegateAdapters.put(AdapterConstants.BAND, BandDelegateAdapter())
        items = ArrayList()

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegateAdapters.get(viewType).onCreateViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegateAdapters.get(getItemViewType(position)).onBindViewHolder(holder, this.items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return this.items.get(position).getViewType()
    }

    fun addBand(band: Band) {
        // insert news and the loading at the end of the list
        items.add(band)
        notifyItemInserted(items.indexOf(band))
    }

    private fun getLastPosition() = if (items.lastIndex == -1) 0 else items.lastIndex
}