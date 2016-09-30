package mzx.kpartify.api.impl

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import mzx.kpartify.KPartifyApp
import mzx.kpartify.api.FirebaseService
import javax.inject.Inject

/**
 * Created by mauricioheredia on 08/09/16.
 */
class FirebaseServiceImpl @Inject constructor(private val application: KPartifyApp) : FirebaseService {
    override fun getFirebaseAuth(): FirebaseAuth {
        return FirebaseAuth.getInstance()
    }

    override fun getDatabaseReference(): DatabaseReference {
        return FirebaseDatabase.getInstance().reference.child("bands")
    }
}