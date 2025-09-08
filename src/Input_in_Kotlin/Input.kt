package Input_in_Kotlin

fun main()
{
    println("Enter your name:")
    var name = readLine()
    println("Enter your age:")
    //var age = readLine()!!.toInt()
    println("My name is $name")
   //println("My age is $age")

    val age = readLine()?.toIntOrNull()
    if(age != null){
        println("You are $age years old.")
    }else{
        println("Invalid input")
    }

}