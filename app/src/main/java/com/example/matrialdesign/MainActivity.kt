package com.example.matrialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout


lateinit var drawerLayout: DrawerLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val imageView = findViewById<ImageView>(R.id.imgBtnMenu)
        imageView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        drawerLayout.openDrawer(GravityCompat.START)
    }


}