package com.love.mawada.screens.home.adapter

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.love.mawada.model.GeneralNote

class CoreRecyclerHomeAdapter<T> constructor(private val clickListener: CoreItemListener):
    ListAdapter<T, CoreRecyclerHomeAdapter.CoreViewHolder> (DiffUtil.ItemCallback<T>()){


    class CoreViewHolder(private val binding: ViewDataBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {

        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CoreViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(p0: CoreViewHolder, p1: Int) {
        TODO("Not yet implemented")
    }


}

class CoreItemListener(val clickListener: (id: Long) -> Unit) {
    fun onClick(generalNote: GeneralNote) {
        clickListener(generalNote.id)
    }
}