package com.example.e13m5

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

class ejercicioa {
}

fun main(){
    var resultado = suma (10.4, 50.3F)
    println (resultado)

    var redondeo= redondeo(15.4)
    println (redondeo)

    var convertirResultado= convertirResultado(8.57)
    println(convertirResultado)
}

fun suma (param1: Double, param2: Float) : Double = param1+param2

fun redondeo (param1:Double) = ceil(param1)

fun convertirResultado (numero: Double) : String{
    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("EUR"))
    println(format.format(numero))
    return format.format(numero)
    
}



