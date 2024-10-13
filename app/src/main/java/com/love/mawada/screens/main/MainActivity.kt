package com.love.mawada.screens.main

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.love.mawada.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        handleSplashScreenVisibility()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    private fun handleSplashScreenVisibility() {
        // Keep the splash screen on-screen for longer periods
        // Set up an OnPreDrawListener to the root view.
        val content: View = findViewById(android.R.id.content)
        content.viewTreeObserver.addOnPreDrawListener {
            // Check whether the initial data is ready.
            true
        }

    }
}

/**
 *  Keep the splash screen on-screen for longer periods
 *  val splashScreen = installSplashScreen()
 *  if set true to setKeepOnScreenCondition then keep splash screen visible in screen false hidden it
 *  splashScreen.setKeepOnScreenCondition { true }
 *
 *   content.viewTreeObserver.addOnPreDrawListener(
 *             object : ViewTreeObserver.OnPreDrawListener {
 *                 override fun onPreDraw(): Boolean {
 *                     // Check whether the initial data is ready.
 *                     return if (viewModel.isReady) {
 *                         // The content is ready. Start drawing.
 *                         content.viewTreeObserver.removeOnPreDrawListener(this)
 *                         true
 *                     } else {
 *                         // The content isn't ready. Suspend.
 *                         false
 *                     }
 *                 }
 *             }
 *         )
 */