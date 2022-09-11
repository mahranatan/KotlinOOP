fun main() {
    val c1 = Car()
    c1.brand = "Tesla"
    c1.model = "Model X"
    c1.yfManufacturer = 2015

    //space
    val c2 = Car()
    c2.brand = "Hyundai"
    c2.model = "Verna"
    c2.yfManufacturer = 2005

    println(c1.brand)
    println(c1.model)
    println(c1.yfManufacturer)
println()
    println("the car brand is  " + c2.brand)
    println(c2.model)
    println(c2.yfManufacturer)
}