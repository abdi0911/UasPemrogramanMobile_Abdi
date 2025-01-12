package com.example.uaspemrogramanmobile_abdi.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.uaspemrogramanmobile_abdi.MainActivity
import com.example.uaspemrogramanmobile_abdi.databinding.ActivitySplashScreenBinding



class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menambahkan log saat SplashScreenActivity dimulai
        Log.d("SplashScreenActivity", "onCreate: Splash Screen Started")

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menambahkan log sebelum berpindah ke MainActivity
        Log.d("SplashScreenActivity", "onCreate: Starting MainActivity after delay")

        Handler(mainLooper).postDelayed({
            // Menambahkan log saat berpindah ke MainActivity
            Log.d("SplashScreenActivity", "onCreate: Navigating to MainActivity")

            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            finish()

            // Menambahkan log setelah activity selesai
            Log.d("SplashScreenActivity", "onCreate: SplashScreenActivity finished")
        }, Config.SPLASH_SCREEN_DELAY)
    }

//import android.content.Intent
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.lifecycle.lifecycleScope
//import com.example.uaspemrogramanmobile_abdi.MainActivity
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import com.example.uaspemrogramanmobile_abdi.R


//class SplashScreenActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash_screen)
//        supportActionBar?.hide()
//
//        lifecycleScope.launch {
//            delay(3000)
//            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
//            finish()
//        }
//    }
}
