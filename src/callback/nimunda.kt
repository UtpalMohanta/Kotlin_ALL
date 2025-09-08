
package callback

/*fun nimunda(nimundaa:()->Unit) {
    println("nimunda0")
    nimundaa()
    //println("nimunda2")
}

fun main() {
    nimunda {
        println("nimunda1")
         }
    }*/


class Car(val model: String) {

    companion object {
        val wheels = 4
        fun carInfo() {
            println("All cars have $wheels wheels.")
        }
    }
}

fun main() {
    // Instance ছাড়া access
    println(Car.wheels)    // 4
    Car.carInfo()          // All cars have 4 wheels.

    // Instance দিয়ে access
    val myCar = Car("Toyota")
    println(myCar.model)   // Toyota
}
/*এখানে তুমি Car class এর constructor-এ "Toyota" পাঠালে।

constructor val model: String এ "Toyota" assign করে রাখে।

মানে এখন → myCar.model = "Toyota"*/
