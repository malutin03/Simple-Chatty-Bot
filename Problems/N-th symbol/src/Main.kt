fun main() {
    val str1: String = readLine()!!.toString()
    val n1: Int = readLine()!!.toInt()
    println("Symbol # $n1 of the string \"$str1\" is \'${str1[n1 - 1]}\'")
}