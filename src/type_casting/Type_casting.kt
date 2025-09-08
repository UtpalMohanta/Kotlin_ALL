package type_casting

fun main()
{
    val number: Int = 10
    val doubleNumber: Double = number.toDouble()
    val floatNumber: Float = number.toFloat()
    println("$doubleNumber $floatNumber")

    val str="123" //obossoi integer number hote hobe
    val numbers=str.toInt()
    val doubleNumbers=str.toDouble()
    val floatNumbers=str.toFloat()
    println(numbers + 1)       // 124
    println("$doubleNumbers $floatNumbers")


    val num = 100
    val strNumber = num .toString()  // Int -> String

    println(strNumber)       // "100"
    println(strNumber + 1)   // "1001" (String হিসেবে জোড়া হয়েছে)

}