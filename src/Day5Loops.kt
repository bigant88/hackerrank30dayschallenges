import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val multiplier = scan.nextInt()
    scan.close()
    for (i in 1..10) {
        System.out.format("%d x %d = %d\n", multiplier, i, i * multiplier)
    }
}