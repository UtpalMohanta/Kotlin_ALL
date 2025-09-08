package Super_this_keyword

//this
/*
class Super_this(var name: String, var age: Int) {
    fun utpalkiRaj(name: String)
   {
       println("My name is: $name & Age is: $age")
       println("I always love ${this.name}")
   }
}
fun main(args: Array<String>) {
   val superThis=Super_this("utpal",25)
   superThis.utpalkiRaj("Mohanta")
}*/

//super
/*open class A {
    fun utpall()
    {
       println("A")
   }
}
class B : A() {
    fun utpalll()
    {
        println("B")
       super.utpall()
   }
}
fun main(args: Array<String>) {
   val b = B()
   b.utpalll()
    b.utpall()
}*/

open class Person(val name: String)

class Student(name: String, val id: Int) : Person(name) {
    fun showInfo() {
        println("Name: $name, ID: $id")
    }
}

fun main() {
    val s = Student("Utpal", 101)
    s.showInfo()
}

