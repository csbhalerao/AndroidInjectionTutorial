package com.chetan.b.androidinjectiontutorial.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chetan.b.androidinjectiontutorial.R
import com.chetan.b.androidinjectiontutorial.model.SportsTeam
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.populateTeam()
    }

    override fun populateTeam(team: SportsTeam) {
        textTeamName.text = team.name
        textNickName.text = team.nickName
        textStadiumName.text = team.stadiumName
    }
}
