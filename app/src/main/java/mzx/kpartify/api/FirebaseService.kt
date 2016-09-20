package mzx.kpartify.api

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference


/**
 * Created by mauricioheredia on 08/09/16.
 */
interface FirebaseService {

    fun getDatabaseReference(): DatabaseReference

    fun getFirebaseAuth(): FirebaseAuth
}