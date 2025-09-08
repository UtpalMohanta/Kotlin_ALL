package continue_break

fun main()
{
    for (i in 1..5) {
        if (i == 3) continue   // 3 skip হবে
        println("Continue print: $i")
    }

    for (i in 1..5) {
        if (i == 4) break     // 4 এ loop stop
        println("Break print: $i")
    }

}