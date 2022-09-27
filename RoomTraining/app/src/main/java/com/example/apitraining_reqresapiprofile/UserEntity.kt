package com.example.apitraining_reqresapiprofile

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class UserEntity(
    @ColumnInfo(name="last_name")
    @field:SerializedName("last_name")
    val lastName: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    @field:SerializedName("id")
    val id: Int,

    @ColumnInfo(name="first_name")
    @field:SerializedName("first_name")
    val firstName: String,

    @ColumnInfo(name="email")
    @field:SerializedName("email")
    val email: String

): Parcelable
