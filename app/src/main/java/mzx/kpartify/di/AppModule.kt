package mzx.kpartify.di

import android.content.Context
import dagger.Module
import dagger.Provides
import mzx.kpartify.KPartifyApp
import javax.inject.Singleton

/**
 * Created by mauricioheredia on 06/09/16.
 */
@Module
class AppModule(val app: KPartifyApp) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return app
    }

    @Provides
    @Singleton
    fun provideApplication(): KPartifyApp {
        return app
    }
}