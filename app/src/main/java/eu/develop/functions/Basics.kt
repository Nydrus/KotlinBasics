package eu.develop.functions

import androidx.core.graphics.convertTo

fun main(){

    var daisy = Dog()
}

fun add(num1:Int, num2:Int):Int{
   val result = num1 + num2
    return result
}
fun divide(num1:Double, num2:Double): Double{
    val result = num1/num2
    return result
}
fun askCoffeeDetails(){
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar does $name want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
    makeCoffee(sugarCountInt,name)
}
fun makeCoffee(sugarCount : Int, name: String){
    if(sugarCount >1) {
        println("Added $sugarCount spoons of sugar to $name 's coffee")
    }else if(sugarCount ==0){
        println("Coffee with no sugar for $name")
    }else if(sugarCount <0){
        println("Fool, you can't add negative numbers to coffee,what's wrong with you $name")
    }
    else{
        println("Added $sugarCount spoon of sugar to $name's coffee")
    }
}