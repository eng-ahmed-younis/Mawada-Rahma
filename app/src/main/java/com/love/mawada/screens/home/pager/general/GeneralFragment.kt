package com.love.mawada.screens.home.pager.general

import android.os.Bundle
import android.view.View
import com.love.mawada.databinding.FragmentGeneralBinding
import com.love.mawada.model.GeneralNote
import com.love.mawada.setRecyclerViewLayoutManger
import com.love.mawada.utils.BaseFragment

class GeneralFragment : BaseFragment<FragmentGeneralBinding>(FragmentGeneralBinding::inflate) {
    private lateinit var generalAdapter: GeneralAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()

    }


    private fun setupRecyclerView() {
        generalAdapter = GeneralAdapter(GeneralItemListener { id ->
         //   val action = GeneralFragmentDirections.actionGeneralFragmentToGeneralDetailFragment(id)
         //   findNavController().navigate(action)
        })
        binding?.generalRecycler?.let { setRecyclerViewLayoutManger(it) }
        generalAdapter.submitList(getGeneralNotes())
        binding?.generalRecycler?.adapter = generalAdapter
    }


    private fun getGeneralNotes(): List<GeneralNote> {
        val generalNotes = mutableListOf<GeneralNote>()
        generalNotes.add(

        )
    }


}