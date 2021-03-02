package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog

@Composable
fun DogDetails(dog: Dog) {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.secondary)
    ) {
        Box {
            Image(
                painterResource(dog.imgResource),
                "Dog picture: ${dog.name}",
                Modifier.aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
        }
        Column(Modifier.padding(16.dp, 8.dp)) {
            Text("Name: ${dog.name}", style = MaterialTheme.typography.h3)
            ProvideTextStyle(MaterialTheme.typography.h5) {
                Text("Breed: ${dog.breed}")
                Text("Location: ${dog.location}")
                Text("Age: ${dog.age}")
            }
        }
    }
}

@Preview
@Composable
fun DogDetailsPreview() {
    DogDetails(
        Dog("毛毛", R.drawable.bianmu, "边境牧羊犬", "China", "3"),
    )
}
