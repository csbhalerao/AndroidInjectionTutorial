package com.chetan.b.androidinjectiontutorial.di

import android.app.Application
import android.content.Context
import com.chetan.b.androidinjectiontutorial.main.MainActivityComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import dagger.Binds



@Module(subcomponents = [MainActivityComponent::class])
 class AppModule {
    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }
}
