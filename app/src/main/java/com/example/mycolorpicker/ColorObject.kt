package com.example.mycolorpicker

class ColorObject(var name: String, var hex: String, var contrastHex: String)
{
    val hexHash : String = "#$hex"
    val contrasHexHash : String = "#$contrastHex"
}