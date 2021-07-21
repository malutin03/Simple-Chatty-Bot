fun main() {
    val countOfNumbers = readLine()!!.toInt()
    var maxNumber = 0
    var nextNumber: Int
    repeat(countOfNumbers) {
        nextNumber = readLine()!!.toInt()
        if (nextNumber % 4 == 0 && nextNumber > maxNumber) {
            maxNumber = nextNumber
        }
    }
    println(maxNumber)
}