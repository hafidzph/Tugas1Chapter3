package com.tugas.tugas1chapter3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas.tugas1chapter3.databinding.ActivitySecondBundleBinding

class SecondActivityBundle : AppCompatActivity() {
    lateinit var binding : ActivitySecondBundleBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener{
            val back = Intent(this, MainActivity::class.java)
            startActivity(back)
        }

        val bundle = intent.extras
        binding.halo.text = "Halo, " + bundle!!.getString("name")
        binding.umur.text = "Umur kamu " + bundle.getInt("age")
    }
}