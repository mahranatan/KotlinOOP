class Cars(var brand:String, var model:String,var year:Int){
    fun drive(){
        println("Y eee Haa , Wroom Wroom! $model!")
    }
    fun speed(maxspeed:Int){
        println("maximum speed is $maxspeed")
    }
}

fun main() {
    val c1 = Car("Hyundai","Verna",2005)
    println(c1.brand + " "+c1.model+" "+c1.year)
    c1.drive()
    val c2= Car("Tesla","Model X",2015)
    println(c2.brand + " "+c2.model+" "+c2.year)
    c2.drive()
    val c3 = Car("Mitsubishi", "Lancer", 2010)
    println(c3.brand + " " + c3.model + " " + c3.year)
    c3.drive()
    c3.speed(200)
}