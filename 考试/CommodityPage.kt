package com.example.middleexam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.savedstate.SavedStateRegistryController

@Composable
fun CommodityPage(navController: NavHostController){
    Column {
       Text(text = "商品")
        Image(painter = painterResource(id = R.drawable._1), contentDescription = null)
        Text(text = "坦克")
        Image(painter = painterResource(id = R.drawable._2), contentDescription = null)
        Text(text = "战斗机")
        Image(painter = painterResource(id = R.drawable._3), contentDescription = null)
        Text(text = "装甲车")
        Button(onClick = {
            navController.navigate("Commodity")
        })
        {
            Text(text = "CommodityPage")
        }
    }
}