package com.example.austin.democracynow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_upcoming_votes.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread
import java.net.URL


class UpcomingVotes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upcoming_votes)
        freedom()
    }

    private fun freedom() {
        val sharedPref = getSharedPreferences("userAddress", 0)
        var address = sharedPref.getString("street", "") + sharedPref.getString("apt", "")+ sharedPref.getString("city", "")+ sharedPref.getString("state", "")+ sharedPref.getString("zip", "")
        address = address.replace("\\s+", "_")
        val call = "https://www.googleapis.com/civicinfo/v2/voterinfo?address=" + address + "&returnAllAvailableData=true&key=" + getString(R.string.google_voter_api_key)
        Log.wtf("CALL",call)
        doAsync {
            val result = URL(call).readText()
            uiThread {
                votes.text = result
                toast(call)
            }
        }
    }
}

