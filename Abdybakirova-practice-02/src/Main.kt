fun main() {
    // Task 1
    print("Enter n: ")
    val n = readln().toInt()
    println("Triple: ${n*n*n} \nSquare: ${n*n}")


    // Task 2
    val a = readln().toInt()
    val b = readln().toInt()
    println("Quotient = ${a/b} \nRemainder = ${a%b} \nExact = ${a.toDouble()/b}")


    // Task 3
    val sec = readln().toInt()
    val hours = sec/3600
    val minutes = (sec%3600)/60
    val seconds = (sec%3600)%60
    println("H:M:S -> $hours:$minutes:$seconds")

    // Task 4
    var score = 0
    val a1 = readln().toInt()
    score += a1
    val b1 = readln().toInt()
    score += b1
    val c1 = readln().toInt()
    score += c1

    println("Final score: $score")


    // Task 5
    val c = readln().toDouble()
    val f = c* 9.0/5.0+32.0

    println("C = $c \nF = $f")

    if (f<32.0) {
        println("below freezing")
    } else {
        println("not below freezing")}


    // Task 6
    val base = 8_100_000_000L
    val add = readln().toInt()
    add.toLong()
    println("Base = $base \nExtra = $add \nTotal = ${base + add}")


    // Task 7
    val small: Byte = 100
    val medium: Short = 20_000
    print((small+medium) is Int)

    // Initializer type mismatch: expected 'Byte', actual 'Int'.


    


}