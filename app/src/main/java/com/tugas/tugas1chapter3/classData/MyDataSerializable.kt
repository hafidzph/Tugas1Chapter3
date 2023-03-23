package com.tugas.tugas1chapter3.classData

data class MyDataSerializable(val name: String,
                              val email: String,
                              val phone: String,
                              val address: String,
                              val age: String) : java.io.Serializable