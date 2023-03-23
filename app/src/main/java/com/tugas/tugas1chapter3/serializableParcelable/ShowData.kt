package com.tugas.tugas1chapter3.serializableParcelable

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas.tugas1chapter3.R
import com.tugas.tugas1chapter3.classData.MyDataParcelable
import com.tugas.tugas1chapter3.classData.MyDataSerializable
import com.tugas.tugas1chapter3.databinding.ActivityShowDataBinding

class ShowData : AppCompatActivity() {
    lateinit var binding: ActivityShowDataBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener{
            val back = Intent(this, InputData::class.java)
            startActivity(back)
        }

        val isParcelable = intent.getBooleanExtra("isParcelable", false)

        if(isParcelable){
            val parcelable = intent.getParcelableExtra<MyDataParcelable>("Parcelable")
            binding.myData.text = "My Data Parcelable"
            binding.name.text = "Nama: " + parcelable?.name
            binding.email.text = "Email: " + parcelable?.email
            binding.phone.text = "Nomor Telepon: " + parcelable?.phone
            binding.address.text = "Alamat Rumah: " + parcelable?.address
            binding.age.text = "Umur: " + parcelable?.age
        }else{
            val serializable = intent.getSerializableExtra("Serializable") as MyDataSerializable
            binding.myData.text = "My Data Serializable"
            binding.name.text = "Nama: " + serializable.name
            binding.email.text = "Email: " + serializable.email
            binding.phone.text = "Nomor Telepon: " + serializable.phone
            binding.address.text = "Alamat Rumah: " + serializable.address
            binding.age.text = "Umur: " + serializable.age
        }
    }
}