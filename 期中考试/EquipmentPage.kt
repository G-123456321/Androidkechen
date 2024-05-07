package com.example.middleexam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController


@Composable
fun EquipmentPage(navController: NavHostController){
    Column {
        Text(text = "装备信息")
        Text(text = "数量")

        Button(onClick = {
            navController.navigate("Equipment")
        }) {
            Text(text = "EquipmentPage")
        }
    }
}