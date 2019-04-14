package com.chetan.b.androidinjectiontutorial.di

import android.app.Application
import com.chetan.b.androidinjectiontutorial.MyTutorialApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuilder::class]
)
interface AppComponent: AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun provideApplication(app: Application): Builder

        fun build(): AppComponent
    }

    //override fun inject(instance: DaggerApplication)

    fun inject(app: MyTutorialApp)
}