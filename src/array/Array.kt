package array

fun main()
{
    //1️⃣ Simple Array:
    //val poltu=arrayOf(1,2,3,4)

    //2️⃣ Typed Array:
    //val poltu: Array<Int> =arrayOf(1,2,3,4)

    //3️⃣ Empty Array + Initialization:
    val poltu=Array(4){0}

    /*for (n in poltu)
    {
        println(n)
    }*/

    /*for (i in poltu.indices)
    {
        println(poltu[i])
    }*/

    println("First index: ${poltu.first()}")
    println("Last index: ${poltu.last()}")

    //🔹 Array Access (Indexing)
    val fruits = arrayOf("Apple", "Banana", "Mango")
    println(fruits[0])   // Output: Apple
    println(fruits[2])   // Output: Mango

    /*val numbers = arrayOf(10, 20, 30)
    numbers[1] = 50       // 20 এর জায়গায় 50 বসানো
    println(numbers[1])   // Output: 50*/

        // 1. Array তৈরি
        val numbers = arrayOf(10, 20, 30, 40, 50)

        // 2. Access
        println("First element: ${numbers[0]}")
        println("Last element: ${numbers[numbers.size - 1]}")

        // 3. Update
        numbers[2] = 99
        println("After update: ${numbers.joinToString()}")

        // 4. Loop - সাধারণ for loop
        println("Using for loop:")
        for (i in numbers.indices) {
            println("Index $i = ${numbers[i]}")
        }

        // 5. Loop - withIndex
        println("Using withIndex:")
        for ((index, value) in numbers.withIndex()) {
            println("Index $index → Value $value")
        }

        // 6. Loop - forEach
        println("Using forEach:")
        numbers.forEach { println(it) }

        // 7. Properties
        println("Size: ${numbers.size}")
        println("First: ${numbers.first()}")
        println("Last: ${numbers.last()}")

        // 8. Sort / Reverse
        val sorted = numbers.sortedArray()
        println("Sorted: ${sorted.joinToString()}")
        val reversed = numbers.reversedArray()
        println("Reversed: ${reversed.joinToString()}")

        // 9. Conditions: any / all
        println("Any > 90? ${numbers.any { it > 90 }}")
        println("All > 0? ${numbers.all { it > 0 }}")

        // 10. Filter (Array থেকে List এ)
        val filtered = numbers.filter { it > 20 }
        println("Filtered (>20): $filtered")

        // 11. Multi-dimensional array
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        println("Matrix elements:")
        for (row in matrix) {
            for (col in row) {
                print("$col ")
            }
            println()
        }
    }


