package com.mudassiryaseen.i230017

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<android.widget.TextView>(R.id.btnSearch).setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        findViewById<android.widget.TextView>(R.id.tabFriends).setOnClickListener {
            startActivity(Intent(this, FriendsActivity::class.java))
        }

        findViewById<android.widget.TextView>(R.id.tabMarketplace).setOnClickListener {
            startActivity(Intent(this, MarketplaceActivity::class.java))
        }

        findViewById<android.widget.TextView>(R.id.tabNotifications).setOnClickListener {
            startActivity(Intent(this, NotificationsActivity::class.java))
        }

        findViewById<android.widget.TextView>(R.id.tabMenu).setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }

        findViewById<android.widget.TextView>(R.id.btnMyAvatar).setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}