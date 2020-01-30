import java.util.*

fun main(args: Array<String>) {
    /* Read input */
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    scan.close()

    val ans = if (n % 2 == 1) {
        "Weird"
    } else {
        if (n in 6..20) {
            "Weird"
        } else {
            "Not Weird"
        }
    }

    /* Print output */
    println(ans)
}