package Interface

/*
interface utpal{
    val utpal: String
    fun print()
}
class Interface: utpal {
    override val utpal="interface"
    override fun print() {
        println("$utpal")
    }
}
fun main(args: Array<String>) {
    val obj = Interface()
    obj.print()
    println(obj.utpal)
}*/

interface Interface {

    val name: String
    val age: Int
    fun print()
}
interface Printable {
    fun papia()
    fun hakuku()
}
class nimunda: Interface, Printable {
    override val name="utpal"
            override val age=25
    override fun print() {
        println("$name $age")
    }
    override fun papia() {
        println("papia")
    }

    override fun hakuku() {
        println("hakuku")
    }
}
fun main(args: Array<String>) {
    val nimunda = nimunda()
    nimunda.papia()
    nimunda.hakuku()
    nimunda.print()
}