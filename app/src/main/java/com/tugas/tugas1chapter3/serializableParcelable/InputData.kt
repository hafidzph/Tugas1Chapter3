package com.tugas.tugas1chapter3.serializableParcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugas.tugas1chapter3.ChooseMethod
import com.tugas.tugas1chapter3.R
import com.tugas.tugas1chapter3.classData.MyDataParcelable
import com.tugas.tugas1chapter3.classData.MyDataSerializable
import com.tugas.tugas1chapter3.databinding.ActivityInputDataBinding

class InputData : AppCompatActivity() {
    lateinit var binding : ActivityInputDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener{
            val back = Intent(this, ChooseMethod::class.java)
            startActivity(back)
        }

        binding.saveBtn.setOnClickListener{
            val myDataParcelable = MyDataParcelable(binding.inputName.text.toString(),
                                                    binding.inputEmail.text.toString(),
                                                    binding.inputPhone.text.toString(),
                                                    binding.inputAddress.text.toString(),
                                                    binding.inputAge.text.toString())
            val myDataSerializable = MyDataSerializable(binding.inputName.text.toString(),
                                                        binding.inputEmail.text.toString(),
                                                        binding.inputPhone.text.toString(),
                                                        binding.inputAddress.text.toString(),
                                                        binding.inputAge.text.toString())
            val moveAct = Intent(this, Choose::class.java)
            moveAct.apply {
                putExtra("Parcelable", myDataParcelable)
                putExtra("Serializable", myDataSerializable)
            }
            startActivity(moveAct)
        }
    }
}