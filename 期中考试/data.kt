package com.example.middleexam

data class Commodity(val id: Int, var name: String, ){
    val commodity = listOf(
        Commodity(1, "坦克" ),
        Commodity(2, "战斗机"),
        Commodity(3, "装甲车")
    )
}
data class Equipment(val id: Int,var name:String,var price:Int){
    val Equipment = listOf(
        Equipment(1,"a",100000000),
        Equipment(2,"b",5000000),
        Equipment(3,"c",2000000)
    )
}



