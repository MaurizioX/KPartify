package mzx.kpartify.di

import dagger.Component
import mzx.kpartify.MainActivity
import javax.inject.Singleton

/**
 * Created by mauricioheredia on 06/09/16.
 */
/**
     *
     * @author juancho.
     */
    @Singleton
    @Component(modules = arrayOf(
            AppModule::class,
            KPartifyModule::class)
    )
    interface KPartifyComponent {

        fun inject(mainActivity:MainActivity)
    }

