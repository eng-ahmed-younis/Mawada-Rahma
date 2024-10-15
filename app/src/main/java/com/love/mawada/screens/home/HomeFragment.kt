package com.love.mawada.screens.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.love.mawada.R
import com.love.mawada.databinding.FragmentHomeBinding
import com.love.mawada.utils.BaseFragment
import com.love.mawada.utils.Constants

class HomeFragment : BaseFragment<FragmentHomeBinding>(
    layoutInflater = FragmentHomeBinding::inflate
) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupHomeViewPager()

    }


    private fun setupHomeViewPager() {
        LovePagerAdapter(
            this.childFragmentManager,
            this.requireActivity()
        ).apply {
            repeat(Constants.screens.size) {
                this.addScreen(Constants.screens[it].fragment)
            }
            binding?.homePager?.adapter = this
        }
        connectTableLayoutWithViewPager()
    }

    private fun connectTableLayoutWithViewPager() {
        binding?.let {
            TabLayoutMediator(it.tabLayout, it.homePager) { tab, position ->
                tab.text = context?.getText(Constants.screens[position].title).toString()
            }.attach()
        }
    }

}