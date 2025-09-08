package enum_ut

/*enum class Enum {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
fun main(args: Array<String>) {
    val today = Enum.Monday
    val tomorrow = Enum.Tuesday
    println(tomorrow.name)
    println(today.name)
}*/

enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun main() {
    val today = Day.FRIDAY

    when (today) {
        Day.MONDAY -> println("Start of the week")
        Day.FRIDAY -> println("Last working day")
        Day.SATURDAY, Day.SUNDAY -> println("Weekend!")
        else -> println("Midweek")
    }
}


