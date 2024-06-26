package com.example.pertemuan2layout.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun ContohColumn() {
    Column {
        Card {
            Text(text = "Hello World")
        }
        Card {
            Text(text = "Hello World 2")
        }
    }
}

@Composable
fun ContohRow() {
    Row {
        Card {
            Text(text = "Hello World")
        }
        Card {
            Text(text = "Hello World 2")
        }
    }
}

@Composable
fun ContohBox() {
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Gray)){

        Card(modifier = Modifier
            .align(Alignment.TopStart)
            .background(Color.Red)) {
            Text(text = "Hello World")
        }
        Card(modifier = Modifier
            .align(Alignment.BottomEnd)
            .background(Color.Red)) {
            Text(text = "Hello World")
        }
        Card(modifier = Modifier
            .align(Alignment.Center)
            .size(80.dp)) {
            Text(text = "Ini Ditengah")
        }
    }
}

@Composable
fun ContohModifier() {
    Text("Custom Text",
        modifier = Modifier
            .padding(8.dp)
            .background(Color.Red)
            .padding(10.dp))
}