fun main() {
    val countOfReadings = readLine()!!.toInt()
    var numA = 0
    var numB = 0
    var numC = 0
    var numD = 0
    var curNum: Int
    repeat(countOfReadings) {
        curNum = readLine()!!.toInt()
        if (curNum == 5) numA++ else if (curNum == 4) numB++ else if (curNum == 3) numC++ else if (curNum == 2) numD++
    }
    println("$numD $numC $numB $numA")
}