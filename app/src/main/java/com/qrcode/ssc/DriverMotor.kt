package com.qrcode.ssc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_driver_motor.*
import java.util.*

class DriverMotor : AppCompatActivity() {

    private var currentPage = 0
    private var numPages = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_motor)

        val images = listOf(
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FDrive%20Motor%20DC%201.jpg?alt=media&token=228450db-0b89-4e40-b81e-007e241cafc5",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FDrive%20Motor%20DC%202.PNG?alt=media&token=1f968951-3b26-49eb-8132-5f5ecb5d8205",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FDrive%20Motor%20DC%203.PNG?alt=media&token=0a24179c-efe2-47cc-b4ed-89febe5ba2c5"
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

    override fun onBackPressed() {
        super.onBackPressed()
    }
}