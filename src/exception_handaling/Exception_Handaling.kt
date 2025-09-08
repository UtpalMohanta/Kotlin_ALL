package exception_handaling

fun main() {
   /* try {
        println("Enter a number:")
        val num = readLine()!!.toInt()   // user input
        println("You entered: $num")
    } catch (e: NumberFormatException) {
        println("Invalid input! Please enter a number.")
    } finally {
        println("Program finished.")
    }*/

    try {
        val arr = arrayOf(1, 2, 3)
        println(arr[5])  // ArrayIndexOutOfBoundsException
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Invalid index!")
    } catch (e: Exception) {
        println("Some error occurred!")
    }
}
