package com.app.catalog.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.catalog.data.entity.Catalog
import com.app.catalog.databinding.CatalogItemBinding

class CatalogListAdapter : ListAdapter<Catalog, CatalogListAdapter.ViewHolder>(CatalogDiff()) {

    inner class ViewHolder(private val binding: CatalogItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: Catalog) {
            binding.root.setBackgroundResource(data.imageRes)
        }
    }

    class CatalogDiff : DiffUtil.ItemCallback<Catalog>() {
        override fun areItemsTheSame(oldItem: Catalog, newItem: Catalog): Boolean {
            return oldItem.type.ordinal == newItem.type.ordinal
        }

        override fun areContentsTheSame(
            oldItem: Catalog,
            newItem: Catalog
        ) = oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            CatalogItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position).run { holder.bindData(this) }
    }
}