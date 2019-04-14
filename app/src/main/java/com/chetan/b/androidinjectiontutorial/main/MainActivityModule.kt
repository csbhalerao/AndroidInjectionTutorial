package com.chetan.b.androidinjectiontutorial.main

import android.content.Context
import com.chetan.b.androidinjectiontutorial.R
import com.chetan.b.androidinjectiontutorial.model.SportsTeam
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    @Provides
    fun providesView(activity: MainActivity): MainView {
        return activity
    }

    @Provides
    fun providesEplTeam(context: Context) = SportsTeam("Arsenal", "Gunners", "Emirates",
        context.getString(R.string.app_name))

    @Provides
    fun providesMainPresenter(view: MainView, team: SportsTeam ) = MainPresenter(view, team)
}
