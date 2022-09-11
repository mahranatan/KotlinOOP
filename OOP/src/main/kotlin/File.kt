open class Operations(){
    fun sum(n1:Double,n2:Double):Double{
        return n1 + n2
    }
    fun sub (n1:Double,n2:Double):Double{
        return n1 - n2
    }

}
class MalOp:Operations(){
    fun div(n1:Double,n2: Double):Double{
        return n1 / n2
    }
}
fun main() {
    var op=Operations()
    println(op.sum(10.10,12.10))
    println(op.sub(10.10,12.10))

}