package com.example.austin.democracynow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_screen.*

class HomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        upcomingVotesBttn.setOnClickListener { upcomingVotes() }
        registrationBttn.setOnClickListener { register() }
        myInfoBttn.setOnClickListener { myInfo() }
        preferencesBttn.setOnClickListener { preferences() }
    }

    private fun upcomingVotes(){}
    private fun register() {}
    private fun myInfo() {}
    private fun preferences() {}

}
