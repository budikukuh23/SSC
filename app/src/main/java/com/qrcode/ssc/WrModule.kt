package com.qrcode.ssc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_storage_places_module.*
import java.util.*

class WrModule : AppCompatActivity() {

    private var currentPage = 0
    private var numPages = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storage_places_module)

        val images = listOf(
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2F12.%20Workpiece%20Reception%20Module%20%5B1%5D.jpg?alt=media&token=beac5ff6-81d0-43eb-ab86-580f467ae02d",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2F13.%20Workpiece%20Reception%20Module%20%5B2%5D.PNG?alt=media&token=da8d1aaa-596e-4244-b537-215c4019e28f"
        )

        createSlider(images)

        val backButton = findViewById<CardView>(R.id.back)
        val camButton = findViewById<CardView>(R.id.camBtn)

        backButton.setOnClickListener {
            onBackPressed()
        }

        camButton.setOnClickListener {
            val intent = Intent(this, MenuScannerActivity::class.java)
            startActivity(intent)
        }

    }

    private fun createSlider(string: List<String>) {

        vpSlider.adapter = SliderAdapter(this, string)
        indicator.setViewPager(vpSlider)
        val density = resources.displayMetrics.density
        //Set circle indicator radius
        indicator.radius = 5 * density
        numPages = string.size
        // Auto getData of viewpager
        val update = Runnable {
            if (currentPage === numPages) {
                currentPage = 0
            }
            vpSlider.setCurrentItem(currentPage++, true)
        }
        val swipeTimer = Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                Handler(Looper.getMainLooper()).post(update)
            }
        }, 5000, 5000)
        // Pager listener over indicator
        indicator.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageSelected(position: Int) {
                currentPage = position
            }

            override fun onPageScrolled(pos: Int, arg1: Float, arg2: Int) {}
            override fun onPageScrollStateChanged(pos: Int) {}
        })
    }
}