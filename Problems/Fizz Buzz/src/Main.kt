fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    for (i in a..b) {
        if (i % 3 != 0 && i % 5 != 0) {
            print(i)
        } else {
            if (i % 3 == 0) print("Fizz")
            if (i % 5 == 0) print("Buzz")
        }
        println()
    }
}