import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    scan.close()
    println(factorial(n))
}

private fun factorial(n: Int): Long {
    if(n== 1) return 1;
    return n * factorial(n-1)
}