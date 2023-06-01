package com.example.lesson_3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lesson_3_7.databinding.ItemLaptopBinding

class LaptopAdapter(
    var laptopList: ArrayList<Laptop>,
    var onClick: (Laptop) -> Unit
) : RecyclerView.Adapter<LaptopAdapter.LaptopViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaptopViewHolder {
        return LaptopViewHolder(
            ItemLaptopBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LaptopViewHolder, position: Int) {
        holder.onBinding(laptopList[position])
        holder.itemView.setOnClickListener {
            onClick(laptopList[position])
        }
    }

    override fun getItemCount(): Int {
        return laptopList.size
    }

    inner class LaptopViewHolder(val binding: ItemLaptopBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBinding(laptop: Laptop) {
            binding.textViewName.text = laptop.name
            binding.textViewPrice.text = "${laptop.price} С"
            Glide.with(binding.imageView).load(laptop.image).into(binding.imageView)
        }
    }
}
