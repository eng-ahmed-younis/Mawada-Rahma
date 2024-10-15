package com.love.mawada

import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable.Orientation
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.love.mawada.R

fun AppCompatActivity.handleWindowInsets(){
    enableEdgeToEdge()
    setContentView(R.layout.activity_main)
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        insets
    }
}


fun Fragment.setRecyclerViewLayoutManger(recyclerView: RecyclerView) {
    val orientation = resources.configuration.orientation
    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    } else {
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

    }
}