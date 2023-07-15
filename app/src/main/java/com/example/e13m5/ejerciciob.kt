package com.example.e13m5

class ejerciciob {
}

data class HeroeList
    (val superHeroe: String,
    val publisher: String,
    val realName: String,
    var photo: String)


fun main(){
    var i=0
    println ("Ingrese cantidad")
    var cantidad : Int = readln().toInt()
    var heroes = mutableListOf<HeroeList>()
    while (cantidad == 1) {
        println("Ingresar nombre superhéroe: ")
        val superHeroe = readln()
        println("Ingresar Publisher")
        val publisher = readln()
        println("Ingresar nombre real")
        val realName = readln()
        println("Cargar foto")
        var photo = readln()
        heroes.add(HeroeList(superHeroe, publisher, realName, photo))

        println("Ingrese 1 para seguir")
        cantidad = readln().toInt()

        for (h in heroes) {
            println(h)
        }
    }

}
