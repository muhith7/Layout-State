package com.example.pertemuan2layout.state

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.math.absoluteValue

@SuppressLint("UnrememberedMutableState")
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column {
        var count by remember { mutableStateOf(0)} //ganti val ke var
        Text(text = "Anda telah meminum $count gelas air")
        Button(onClick = { count++ },
            Modifier
                .padding(top = 50.dp)
                .align(Alignment.CenterHorizontally)) {
            Icon(imageVector = Icons.Rounded.Add, contentDescription = "Tambah")
        }
    }
}