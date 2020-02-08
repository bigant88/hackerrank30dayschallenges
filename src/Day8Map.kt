
import java.util.*

fun main(args: Array<String>) {
    /* Save input as entries in a HashMap */
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val map = HashMap<String, Int>()
    for (i in 0 until n) {
        val name = scan.next()
        val phone = scan.nextInt()
        map[name] = phone
    }

    /* Read each query and check if its in our HashMap */
    while (scan.hasNext()) {
        val str = scan.next()
        if (map.containsKey(str)) {
            println(str + "=" + map[str])
        } else {
            println("Not found")
        }
    }

    scan.close()
}