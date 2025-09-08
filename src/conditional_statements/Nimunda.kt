package conditional_statements

fun main() {

    /*val marks = 75

    if (marks >= 80) {
        println("Grade: A")
    } else if (marks >= 60) {
        println("Grade: B")
    } else if (marks >= 40) {
        println("Grade: C")
    } else {
        println("Fail")
    }*/

    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
}

