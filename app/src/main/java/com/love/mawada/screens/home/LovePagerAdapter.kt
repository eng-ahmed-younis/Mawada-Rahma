package com.love.mawada.screens.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class LovePagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity.supportFragmentManager, fragmentActivity.lifecycle) {

    private val screens: MutableList<Fragment> = mutableListOf()
    override fun getItemCount(): Int = screens.size

    override fun createFragment(position: Int): Fragment {
        return screens[position]
    }

    fun addScreen(fragment: Fragment)  = screens.add(fragment)


}