package com.qrcode.ssc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_motor_servo.*
import java.util.*

class MotorServo : AppCompatActivity() {

    private var currentPage = 0
    private var numPages = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motor_servo)

        val images = listOf(
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FMotor%20Servo%20DC%201.jpg?alt=media&token=8e437971-07f8-409f-a8c2-4ebb50108038",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FMotor%20Servo%20DC%202.PNG?alt=media&token=616e9ae5-9a0d-4132-9628-9dbd8c7d4ce9",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FMotor%20Servo%20DC%203.jpg?alt=media&token=01d995c6-830e-467a-8163-ff8ff0fa7acd",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FMotor%20Servo%20DC%204.PNG?alt=media&token=eda6c80d-5ab5-404b-b175-baf7b35c8dcd",
            "https://firebasestorage.googleapis.com/v0/b/my-thesis-c5a39.appspot.com/o/ASRS%2FMotor%20Servo%20DC%205.PNG?alt=media&token=4d912cc9-a04d-4c53-8989-cfb043ea9a90"
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