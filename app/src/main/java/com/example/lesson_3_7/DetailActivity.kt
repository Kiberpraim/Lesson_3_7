package com.example.lesson_3_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.lesson_3_7.databinding.ActivityDetailBinding
import com.example.lesson_3_7.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    lateinit var laptop: Laptop
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        laptop = intent.getSerializableExtra("laptop") as Laptop

        Glide.with(binding.imageViewImage).load(laptop.image).into(binding.imageViewImage)
        binding.textViewTitle.text = laptop.name
        binding.textViewPrice.text = laptop.price.toString()+" Cом"
        binding.textViewDescription.text = laptop.description

    }
}