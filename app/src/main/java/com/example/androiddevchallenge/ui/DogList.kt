package com.example.androiddevchallenge.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DogList(dogs: List<Dog>, onDogClick: (Dog) -> Unit = {}) {
    LazyColumn(
        Modifier.background(MaterialTheme.colors.secondary),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dogs) { dog ->
            DogCard(
                dog,
                Modifier
                    .clickable(onClick = { onDogClick(dog) })
                    .padding(8.dp)
                    .fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun DogListPreview() {
    val dogs = listOf(
        Dog("毛毛", R.drawable.bianmu, "边境牧羊犬", "China", "3"),
        Dog("小王", R.drawable.deguomuyangquan, "德国牧羊犬", "China", "6"),
        Dog("吉田", R.drawable.guibinquan, "贵宾犬", "Japan", "3"),
    )
    MyTheme {
        DogList(dogs)
    }
}