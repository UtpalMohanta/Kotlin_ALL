package lamda_expression

/*class Nimunda {
    val nimunda:(Int, Int) -> Int={a,b -> a+b}
}

fun main() {
    val nimunda=Nimunda()
   // nimunda.nimunda(4,5)
    println(nimunda.nimunda(4,5))
   // println(nimunda)
}*/

/*var nimunda:(Int ,Int) -> Int = {a,b->a+b}

fun main(){
    var nimunda = nimunda(3,4)
   println("Number is: $nimunda is Nimuda Dosra Talme")
}*/

/*val nimunda={a: Int,b: Int -> a+b}
fun main()
{
    println(nimunda(4,5))
}*/

class Calculator {
    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}

fun main() {
    val calc = Calculator()
    val result = calc.calculate(10, 5) { x, y -> x * y }  // multiply
    //println(result)  // Output: 50
}




/*val greet: () -> Unit = { println("Hello World!") }

fun main() {
    greet()   // Output: Hello World!
}*/

/*val square: (Int) -> Int = { it * it }

fun main() {
    println(square(5))   // Output: 25
}*/


