import java.util.Scanner


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val T = scan.nextInt()
    for (i in 0 until T) {
        val str = scan.next()
        printEvensOdds(str)
    }
    scan.close()
}

/* For efficient appending, use a StringBuffer instead of a String */
fun printEvensOdds(str: String) {
    val evens = StringBuffer()
    val odds = StringBuffer()
    for (i in 0 until str.length) {
        val ch = str[i]
        if (i % 2 == 0) {
            evens.append(ch)
        } else {
            odds.append(ch)
        }
    }
    println(evens.toString() + " " + odds)
}
