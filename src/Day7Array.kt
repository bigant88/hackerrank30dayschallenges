import java.util.*

fun main(args: Array<String>) {
    /* Read and save input */
    val scan = Scanner(System.`in`)
    val size = scan.nextInt()
    val array = IntArray(size)
    for (i in 0 until size) {
        array[i] = scan.nextInt()
    }
    scan.close()

    /* Print elements in reverse order */
    for (i in size - 1 downTo 0) {
        print(array[i].toString() + " ")
    }
}