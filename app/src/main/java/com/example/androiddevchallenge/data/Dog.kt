package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Dog(
    val name: String,
    @DrawableRes val imgResource: Int,
    val breed: String,
    val location: String,
    val age: String
)
