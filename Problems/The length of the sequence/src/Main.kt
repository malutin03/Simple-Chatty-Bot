import java.util.*

fun main() {
    var nextNum: Int
    var len = 0
    var isZeroReached = false
    val scanner = Scanner(System.`in`)

    while (scanner.hasNext()) {
        nextNum = scanner.next().toInt()
        if (!isZeroReached) len++
        if (nextNum == 0) isZeroReached = true
    }
    println(len - 1)
}