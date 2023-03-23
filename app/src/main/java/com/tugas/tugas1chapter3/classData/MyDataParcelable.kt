package com.tugas.tugas1chapter3.classData

import android.os.Parcel
import android.os.Parcelable

data class MyDataParcelable(val name: String,
                              val email: String,
                              val phone: String,
                              val address: String,
                              val age: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(email)
        parcel.writeString(phone)
        parcel.writeString(address)
        parcel.writeString(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyDataParcelable> {
        override fun createFromParcel(parcel: Parcel): MyDataParcelable {
            return MyDataParcelable(parcel)
        }

        override fun newArray(size: Int): Array<MyDataParcelable?> {
            return arrayOfNulls(size)
        }
    }
}