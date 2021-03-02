package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Dog

class MainViewModel : ViewModel() {
    val dogs by mutableStateOf(
        listOf(
            Dog("毛毛", R.drawable.bianmu, "边境牧羊犬", "China", "3"),
            Dog("小王", R.drawable.deguomuyangquan, "德国牧羊犬", "China", "6"),
            Dog("吉田", R.drawable.guibinquan, "贵宾犬", "Japan", "3"),
            Dog("鸣人", R.drawable.zangao, "藏獒", "Japan", "2"),
            Dog("老李", R.drawable.jiwawa, "吉娃娃", "English", "1"),
            Dog("馒头", R.drawable.qiutianquan, "秋田犬", "English", "5"),
        )
    )

    var currentDog: Dog? by mutableStateOf(null)

    fun showDog(dog: Dog) {
        currentDog = dog
    }

    fun closeDog() {
        currentDog = null
    }

}