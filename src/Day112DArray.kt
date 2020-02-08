import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = Array(6) { IntArray(6) }
    for (row in 0..5) {
        for (col in 0..5) {
            arr[row][col] = scan.nextInt()
        }
    }
    scan.close()

    println(maxHourglass(arr))
}

fun maxHourglass(arr: Array<IntArray>): Int {
    var max = Integer.MIN_VALUE
    for (row in 0..3) {
        for (col in 0..3) {
            val sum = findSum(arr, row, col)
            max = Math.max(max, sum)
        }
    }
    return max
}

private fun findSum(arr: Array<IntArray>, r: Int, c: Int): Int {
    return (arr[r + 0][c + 0] + arr[r + 0][c + 1] + arr[r + 0][c + 2]
                            + arr[r + 1][c + 1] +
            arr[r + 2][c + 0] + arr[r + 2][c + 1] + arr[r + 2][c + 2])
}