package com.love.mawada.screens.home.pager.general

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.love.mawada.databinding.GeneralItemViewBinding
import com.love.mawada.model.GeneralNote

class GeneralAdapter (
    private val clickListener: GeneralItemListener
): ListAdapter<GeneralNote, GeneralAdapter.GeneralViewHolder>(GeneralNoteDiffCallback()) {


    class GeneralViewHolder(private val binding: GeneralItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind( generalNote: GeneralNote , clickListener: GeneralItemListener) {
            binding.generalNote = generalNote
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): GeneralViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = GeneralItemViewBinding.inflate(layoutInflater, parent, false)
                return GeneralViewHolder(binding)
            }
        }
    }

    class GeneralNoteDiffCallback : DiffUtil.ItemCallback<GeneralNote>() {
        override fun areItemsTheSame(oldItem: GeneralNote, newItem: GeneralNote): Boolean {
            return oldItem.id == newItem.id
        }
        override fun areContentsTheSame(oldItem: GeneralNote, newItem: GeneralNote): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): GeneralViewHolder  = GeneralViewHolder.from(viewGroup)


    override fun onBindViewHolder(viewholder: GeneralViewHolder, position: Int)  = viewholder.bind(getItem(position), clickListener)


}

class GeneralItemListener(val clickListener: (id: Long) -> Unit) {
    fun onClick(generalNote: GeneralNote) {
        clickListener(generalNote.id)
    }
}