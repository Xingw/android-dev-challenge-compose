package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun DogCard(
    dog: Dog,
    modifier: Modifier
) {
    Card(modifier = modifier) {
        Row(
            modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val imageSize = 100.dp
            Image(
                painter = painterResource(id = dog.imgResource),
                contentDescription = "dog1",
                modifier = Modifier
                    .height(imageSize)
                    .width(imageSize)
                    .fillMaxHeight(),
                contentScale = ContentScale.FillHeight
            )
            Spacer(modifier = Modifier.size(8.dp))
            Column(horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Top) {
                Text(dog.name, style = typography.h6)
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = "Breed:${dog.breed}")
                Text(text = "Location:${dog.location}")
                Text(text = "Age:${dog.age}")
            }

        }
    }
}