package com.example.middleexam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController


@Composable
fun EndPage(navController: NavHostController){
    Column {
        Text(text = "结束")
        Text(text = "end")
        Button(onClick = {
            navController.navigate("End")
        }) {
            Text(text = "EndPage")
        }
    }
}