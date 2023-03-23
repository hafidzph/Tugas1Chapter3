package com.tugas.tugas1chapter3.serializableParcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas.tugas1chapter3.classData.MyDataParcelable
import com.tugas.tugas1chapter3.classData.MyDataSerializable
import com.tugas.tugas1chapter3.databinding.ActivityChooseBinding

class Choose : AppCompatActivity() {
    lateinit var binding : ActivityChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener{
            val back = Intent(this, InputData::class.java)
            startActivity(back)
        }

        binding.parcelable.setOnClickListener{
            parcelableMove()
        }

        binding.serializable.setOnClickListener{
            serializableMove()
        }
    }

    private fun parcelableMove(){
        val intentAct = Intent(this, ShowData::class.java)
        intentAct.apply {
            putExtra("isParcelable", true)
            putExtra("Parcelable", intent.getParcelableExtra<MyDataParcelable>("Parcelable"))
        }
        startActivity(intentAct)
    }

    private fun serializableMove(){
        val intentAct = Intent(this, ShowData::class.java)
        intentAct.putExtra("Serializable", intent.getSerializableExtra("Serializable") as MyDataSerializable)
        startActivity(intentAct)
    }
}