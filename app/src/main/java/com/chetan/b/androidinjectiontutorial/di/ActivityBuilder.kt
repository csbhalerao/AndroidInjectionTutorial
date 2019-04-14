package com.chetan.b.androidinjectiontutorial.di

import com.chetan.b.androidinjectiontutorial.main.MainActivity
import com.chetan.b.androidinjectiontutorial.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class  ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun  bindMainActivity(): MainActivity
}
