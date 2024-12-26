package eu.develop.functions

class Dog (val name:String, val breed:String) {
    init{
        bark(name)
    }
    fun bark(name: String){

        println("Woof woof")
    }
}