package com.tugas.tugas1chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas.tugas1chapter3.databinding.ActivityChooseMethodBinding
import com.tugas.tugas1chapter3.serializableParcelable.InputData

class ChooseMethod : AppCompatActivity() {
    lateinit var binding : ActivityChooseMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sAndP.setOnClickListener{
            val moveToSandP = Intent(this, InputData::class.java)
            startActivity(moveToSandP)
        }

        binding.bundle.setOnClickListener{
            val moveToBundle = Intent(this, MainActivity::class.java)
            startActivity(moveToBundle)
        }
    }
}