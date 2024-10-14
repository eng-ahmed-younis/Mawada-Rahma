package com.love.mawada.utils

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

// we use polymorphism polymorphic variable each binding class extend from ViewBinding then
// each ViewBinding  replace by another binding class
abstract class BaseFragment<VB : ViewBinding> constructor(
    private val layoutInflater: (inflater: LayoutInflater) -> VB
) : Fragment() {

    //bindings
    private var _binding: VB? = null
    //Binding
    protected val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = layoutInflater.invoke(inflater)
        return binding?.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}