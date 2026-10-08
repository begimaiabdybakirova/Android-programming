fun main() {
//    Task 1 — List basics
    val nums = listOf(4, 8, 15, 16, 23)
    println("first = ${nums[0]}")
    println("last = ${nums[nums.size - 1]}")
    println("size = ${nums.size}")


//    Task 2 — Mutable shopping list
    val items = mutableListOf("milk", "bread")
    val newItem = readln()
    items.add(newItem)
    items[0] = "oat milk"
    println(items)
    println("size = ${items.size}")


//    Task 3 — repeat banner
    val n = readln().toInt()

    repeat(n) {
        print("*")
    }

    println()

//    Task 4 — Countdown while
    var n1 = readln().toInt()

    while (n1 > 0) {
        println(n1)
        n1--
    }

    println("Go!")


//    Task 5 — Sum with for and size
    val xs = listOf(2, 1, 7, 4)

    var sumA = 0

    for (x in xs) {
        sumA += x
    }

    var sumB = 0

    for (i in 0 until xs.size) {
        sumB += xs[i]
    }

    println("sum A = $sumA")
    println("sum B = $sumB")


//    Task 6 — Range printer
    for (i in 1..5) {
        print("$i ")
    }
    println()

    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    for (i in 0 until 3) {
        print("$i ")
    }
    println()

    for (i in 1..9 step 2) {
        print("$i ")
    }
    println()


//    Task 7 — Teen check with in
    val age = readln().toInt()

    if (age in 13..19) {
        println("Teen")
    } else {
        println("Not a teen")
    }


//    Task 8 — Menu with do-while
    var choice: Int

    do {
        println("1) Hello  2) Quit")
        choice = readln().toInt()

        when (choice) {
            1 -> println("Hello!")
            2 -> {}
            else -> println("Unknown")
        }
    } while (choice != 2)

//    Task 9 — Sum a line with split
    print("Enter numbers: ")

    val parts = readln().split(" ")

    var sum = 0

    for (part in parts) {
        if (part.isNotEmpty()) {
            sum += part.toInt()
        }
    }

    println("Sum = $sum")

//    Challenge (optional)
    val names = readln().split(",")

    for (i in names.indices) {
        println("$i: ${names[i].trim()}")
    }
}
