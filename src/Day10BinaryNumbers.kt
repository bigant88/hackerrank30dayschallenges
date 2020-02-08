import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    scan.close()
    println(consecutiveOnes(n))
}

fun consecutiveOnes(input: Int): Int {
    var inputNumber = input
    var count = 0
    var max = 0
    while (inputNumber > 0) {
        if (inputNumber % 2 == 1) {
            count++
            max = Math.max(max, count)
        } else {
            count = 0
        }
        inputNumber = inputNumber shr 1
    }
    return max
}