package com.love.mawada.utils

import com.love.mawada.R
import com.love.mawada.screens.home.pager.GeneralFragment
import com.love.mawada.screens.home.pager.Screen
import com.love.mawada.screens.home.pager.SexualFragment
import com.love.mawada.screens.home.pager.WishFragment

object Constants {

    val screens = listOf(
        Screen(R.string.general, GeneralFragment()),
        Screen(R.string.wish, WishFragment()),
        Screen(R.string.sexual, SexualFragment())

    )
}