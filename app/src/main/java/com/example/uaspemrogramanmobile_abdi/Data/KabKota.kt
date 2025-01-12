package com.example.uaspemrogramanmobile_abdi.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KabKota (
    var nama:String = "",
    var lokasi:String = "",
    var detail:String = "",
    var rating:Double = 0.0,
    var ulasan:Int = 0,
    var gambar:Int = 0
):  Parcelable
