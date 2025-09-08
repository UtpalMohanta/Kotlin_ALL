package abstraction

abstract class Abstraction {
    init {
        println("My abstraction")
    }
    abstract val ut: String
    abstract fun great(int: Int,int1: Int): Int
    abstract fun print()
    abstract fun inheritance(int2: Int,int3: Int)
}
class utpalKiRaj: Abstraction() {
    override val ut="UTPALKK"
    override fun great(int: Int, int1: Int): Int{
        return int+int1
    }
    override fun print() {
        println("utpal ka jalowa")
    }

    override fun inheritance(int2: Int, int3: Int) {
        println("inheritance ${int2+int3}")
    }
}
fun main(args:Array<String>){
    val utpalKiRaj = utpalKiRaj()
    utpalKiRaj.print()
    utpalKiRaj.inheritance(1,2)
    println(utpalKiRaj.great(3,4))
    println(utpalKiRaj.ut)
}