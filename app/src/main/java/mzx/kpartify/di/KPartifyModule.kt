package mzx.kpartify.di

import dagger.Module
import dagger.Provides
import mzx.kpartify.api.FirebaseService
import mzx.kpartify.api.impl.FirebaseServiceImpl
import javax.inject.Singleton

/**
 * Created by mauricioheredia on 08/09/16.
 */
@Module
class KPartifyModule {
    @Provides
    @Singleton
    fun provideFirebaseService(firebaseService: FirebaseServiceImpl): FirebaseService {
        return firebaseService
    }
}