fun main() {
//    Task 1 — Char vs String
    val letter: Char = 'K'
    val word: String = "K"

    // Char - a single character, String - a sequence of characters.
    println(letter)
    println(word)

    println(word[0])

//    Task 2 — First and last
    val line = readln()
    if (line.isEmpty()) {
            println("Empty input")
    } else {
            println("first = ${line[0]}")
            println("last = ${line[line.length - 1]}")
    }



//    Task 3 — Classify one character
    print("Enter char: ")
    val line2 = readln()
    val ch = line2[0]

    when (ch) {
        in '0'..'9' -> println("Digit")
        in 'A'..'Z' -> println("Uppercase")
        in 'a'..'z' -> println("Lowercase")
        else -> println("Other")
    }


//    Task 4 — Digit to value
    val line3 = readln()
    val ch3 = line3[0]
    val value = ch3 - '0'

    println("value = $value")
    println(value * 2)

//    Task 5 — Count letters
    print("Enter text: ")
    val line4 = readln()
    var count = 0

    for (ch in line4) {
        if (ch.isLetter()) {
            count++
        }
    }
    println("Letters: $count")


//    Task 6 — Keep only letters
    val line5 = readln()
    var result = ""

    for (ch in line5) {
        if (ch.isLetter()) {
            result += ch
        }
    }
    println(result)


//    Task 7 — Helpers tour
    val line6 = readln()
    val ch6 = line[0]

    println(ch6.isDigit())
    println(ch6.isLetter())
    println(ch6.isWhitespace())
    println(ch6.lowercaseChar())
    println(ch6.uppercaseChar())

}



