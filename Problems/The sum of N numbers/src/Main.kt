fun main() {
    val n = readLine()!!.toInt()
    var num: Int
    var sum = 0
    repeat(n) {
        num = readLine()!!.toInt()
        sum += num
    }
    println(sum)
}