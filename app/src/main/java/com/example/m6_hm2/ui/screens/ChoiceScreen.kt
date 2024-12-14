package com.example.m6_hm2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.m6_hm2.R
import com.example.m6_hm2.ui.model.PersonModel

@Composable
fun ChoiceScreen(paddingValues: PaddingValues, onItemClick: (PersonModel) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(paddingValues)
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(horizontal = 20.dp)
        ) {
            items(PersonModel.getMockList()) { item ->
                MockItem(personModel = item, onItemClick = onItemClick)
            }
        }
    }
}

@Composable
fun MockItem(personModel: PersonModel, onItemClick: (PersonModel) -> Unit) {
    Spacer(modifier = Modifier.height(16.dp))
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.LightGray)
            .padding(start = 12.dp)
            .clickable { onItemClick(personModel) }
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(personModel.images.firstOrNull())
                .crossfade(true)
                .build(),
            contentDescription = "image",
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(18.dp)),
            placeholder = painterResource(id = R.color.white),
            error = painterResource(id = R.color.black)
        )
        Text(
            text = personModel.name,
            fontSize = 18.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = personModel.title,
            fontSize = 16.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = personModel.age,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}
