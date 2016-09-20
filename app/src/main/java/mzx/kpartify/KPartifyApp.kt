package mzx.kpartify

import android.app.Application
import mzx.kpartify.di.AppModule
import mzx.kpartify.di.DaggerKPartifyComponent
import mzx.kpartify.di.KPartifyComponent

/**
 * Created by mauricioheredia on 06/09/16.
 */
class KPartifyApp : Application() {

    companion object {
        lateinit var newsComponent: KPartifyComponent
    }

    override fun onCreate() {
        super.onCreate()

        newsComponent = DaggerKPartifyComponent.builder()
               .appModule(AppModule(this))
                //.newsModule(NewsModule()) Module with empty constructor is implicitly created by dagger.
                .build()
    }
}