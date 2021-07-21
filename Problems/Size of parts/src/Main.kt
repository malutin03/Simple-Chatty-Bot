fun main() {
    val countOfReadings = readLine()!!.toInt()
    var numOfPerfect = 0
    var numOfLarger = 0
    var numOfRejections = 0
    var curNum: Int
    repeat(countOfReadings) {
        curNum = readLine()!!.toInt()
        if (curNum == 0) numOfPerfect++ else if (curNum == 1) numOfLarger++ else numOfRejections++
    }
    println("$numOfPerfect $numOfLarger $numOfRejections")
}