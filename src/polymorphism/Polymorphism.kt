package polymorphism

//Compile time
/*
class Polymorphism {

    fun krishna()
    {
        println("krishna")
    }
    fun nimunda2(a: Int, b: Int): Int {

        return a+b
    }

    fun nimunda3(a: Int, b: Int,c: Int): Int {

        return a+b+c
    }

}
fun main(args: Array<String>) {
    val polymorphism = Polymorphism()
    polymorphism.krishna()
    println(polymorphism.nimunda2(1,2))
    println(polymorphism.nimunda3(1,2,3))

}*/

//RunTime
open class Polymorphism {
    open fun nimunda(nimunda: Int){
         println("utpal Mohanta")
    }
}
open class Nimunda : Polymorphism() {
    override fun nimunda(nimunda: Int){
        println("nimunda1 $nimunda")
    }
}
class Nimunda2 : Nimunda() {
    override fun nimunda(nimunda: Int){
        println("nimunda11 $nimunda")
    }
}
fun main(args: Array<String>) {
    val polymorphism = Nimunda()
    polymorphism.nimunda(3)
}