package inheritance

//Constructor + Inheritance
open class Inheritance(val name:String)
{
    fun great()
    {
        println("great")
    }
}
class Derived(name:String, val age: Int): Inheritance(name){

    fun print(){
        println("utpal mohanta age is $age")
        println(" Utpal name is ${name}")
    }
}
fun main(){
    val inheritance= Derived("jaton",25)
    inheritance.great()
    inheritance.print()
}