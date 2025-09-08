package generics

/*
class Generics<T>(val name:T) {

    val ut=name
    fun print() {
        println(name)
    }
    fun <T> utpal(value:T) {
        println(value)
    }

}
fun main(args: Array<String>) {
    val generics1 = Generics<String>("Kotlin")
   println(generics1.ut)
    generics1.print()
    generics1.utpal("mohanta")
}*/


class PairBox<T, U>(val first: T, val second: U) {
    fun showPair() {
        println("First: $first, Second: $second")
    }
}

fun main() {
    val pair = PairBox("Utpal", 22)
    pair.showPair()
}
