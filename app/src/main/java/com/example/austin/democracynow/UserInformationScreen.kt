package com.example.austin.democracynow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_user_information_screen.*
import org.jetbrains.anko.toast

class UserInformationScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information_screen)
        errorText.visibility = View.INVISIBLE
        submitBttn.setOnClickListener {submitAddress()}
    }

    private fun submitAddress(){
        val sharedPref = getSharedPreferences("userAddress",0)
        val editor = sharedPref.edit()
        editor.putString("street",streetEditText.text.toString())
        editor.putString("apt",aptEditText.text.toString())
        editor.putString("city",cityEditText.text.toString())
        editor.putString("state",stateEditText.text.toString())
        editor.putString("zip",zipEditText.text.toString())
        editor.commit()
        val user = User(streetAddress = sharedPref.getString("street",null),streetAddress2 = sharedPref.getString("apt",null),city = sharedPref.getString("city",null),state = sharedPref.getString("state",null),zip = sharedPref.getString("zip",null))

        if(user.state.isNullOrEmpty())
        {
            errorText.visibility = View.VISIBLE
        }
        else
        {
            val intent = Intent(this,HomeScreen::class.java)
            startActivity(intent)
        }
    }
}
