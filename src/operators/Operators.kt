package operators

fun main() {
    // Arithmetic Operators
    val a = 10
    val b = 3
    println("a + b = ${a + b}")  // 13
    println("a - b = ${a - b}")  // 7
    println("a * b = ${a * b}")  // 30
    println("a / b = ${a / b}")  // 3
    println("a % b = ${a % b}")  // 1

    println("----------")

    // Assignment Operators
    var x = 5
    println("x = $x")
    x += 3   // x = 8
    println("x += 3 -> $x")
    x *= 2   // x = 16
    println("x *= 2 -> $x")

    println("----------")

    // Comparison Operators
    println("a == b: ${a == b}")   // false
    println("a != b: ${a != b}")   // true
    println("a > b: ${a > b}")     // true
    println("a < b: ${a < b}")     // false
    println("a >= b: ${a >= b}")   // true
    println("a <= b: ${a <= b}")   // false

    println("----------")

    // Logical Operators
    val t = true
    val f = false
    println("t && f: ${t && f}")   // false
    println("t || f: ${t || f}")   // true
    println("!t: ${!t}")           // false

    println("----------")

    // Increment / Decrement
    var num = 5
    println("num = $num")
    num++
    println("num++ -> $num")
    num--
    println("num-- -> $num")
}
