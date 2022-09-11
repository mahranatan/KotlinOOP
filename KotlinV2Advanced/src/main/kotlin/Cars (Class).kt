
class Car(){
    constructor(Type:String, Model:Int , Price:Double , Owner:String , Country:String) : this() {
        println("The Car's Type is $Type")
        println("The Car's Model is $Model")
        println("The Car's Price is $Price")
        println("The Car's Owner is $Owner")
        println("The Manufacture Country is $Country")
    }
}

fun main() {
    val c1 =Car("Mercedes",2016,55000.99, "Muhammad" , "Germany")
    println()
    val c2 =Car("Audy",2009,124339.99, "Ali", "Austria")
}