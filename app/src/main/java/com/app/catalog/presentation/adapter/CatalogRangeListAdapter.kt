package com.app.catalog.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.catalog.data.entity.CatalogRange
import com.app.catalog.databinding.CatalogRangeCardBinding

class CatalogRangeListAdapter :
    ListAdapter<CatalogRange, CatalogRangeListAdapter.ViewHolder>(CatalogRangeDiff()) {

    inner class ViewHolder(private val binding: CatalogRangeCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: CatalogRange) {
            with(binding) {
                ivThumbnail.setBackgroundResource(data.itemImage)
                tvTitle.text = data.title
                tvSubtitle.text = data.subtitle
            }
        }

    }

    class CatalogRangeDiff : DiffUtil.ItemCallback<CatalogRange>() {
        override fun areItemsTheSame(oldItem: CatalogRange, newItem: CatalogRange): Boolean {
            return oldItem.title.contentEquals(newItem.title) && oldItem.subtitle.contentEquals(
                newItem.subtitle
            )
        }

        override fun areContentsTheSame(
            oldItem: CatalogRange,
            newItem: CatalogRange
        ) = oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CatalogRangeCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position).run { holder.bindData(this) }
    }
}