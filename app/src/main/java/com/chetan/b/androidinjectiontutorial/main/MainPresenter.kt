package com.chetan.b.androidinjectiontutorial.main

import com.chetan.b.androidinjectiontutorial.model.SportsTeam

class MainPresenter(
    val view: MainView,
    val team: SportsTeam
) {
    fun populateTeam() {
        view.populateTeam(team)
    }

}
