package com.example.austin.democracynow

import android.content.Intent
import android.net.Uri
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

    private fun upcomingVotes(){
        val intent = Intent(this, UpcomingVotes::class.java)
        startActivity(intent)
    }
    private fun register() {
        val url = "https://www.rockthevote.org/register-to-vote"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
    private fun myInfo() {
        val intent = Intent(this,UserInformationScreen::class.java)
        startActivity(intent)
    }
    private fun preferences() {}

}
