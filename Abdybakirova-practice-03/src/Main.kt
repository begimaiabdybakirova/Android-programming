fun main() {
    // Task 1 — Pass / fail
    print("Enter score: ")
    val score = readln().toInt()
    if (score>=50) {
        println("Pass")
    } else {
        println("Fail")
    }

    // Task 2 — Temperature bands
    print("Enter the temp: ")
    val temp = readln().toInt()
    if (temp<0) {
        println("Freezing")
    } else if(temp>=0 && temp<=14) {
        println("Cold")
    } else if (temp>=15 && temp<=24) {
        println("Mild")
    } else {
        println("Warm")
    }

    // Task 3 — Cinema entry (combining)
    print("Enter your age: ")
    val age = readln().toInt()
    print("Do you have a ticket?:")
    val ticket = readln()
    if (age>=12 && ticket=="yes") {
        println("Enter")
    } else if(age<12) {
        println("Too young")
    } else {
        println("Need a ticket")
    }

    // Task 4 — Discount age
    print("Enter your age: ")
    val age1 = readln().toInt()
    if (age1<13 || age1>65) {
        println("Discount")
    } else {
        println("Regular")
    }


    // Task 5 — if as an expression
    print("a: ")
    val a = readln().toInt()
    print("b: ")
    val b = readln().toInt()
    val max = if (a>b) a else b
    println("max = $max")

    // Task 6 — Grade with when
    print("Enter scores: ")
    val scores = readln().toInt()
    val grade = when (scores) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
    println("Grade: $grade")

    // Task 7 — Subject-less when
    print("Enter a number: ")
    val n = readln().toInt()
    val x = when {
        n<0 -> "negative"
        n==0 -> "zero"
        n%2==0 -> "positive even"
        else -> "positive odd"
    }
    println(x)




}