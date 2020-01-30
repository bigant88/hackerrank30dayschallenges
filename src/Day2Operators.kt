import java.util.*

// Complete the solve function below.
fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Long {
    val tip_cost = meal_cost * tip_percent / 100
    val tax_cost = meal_cost * tax_percent / 100
    return Math.round(meal_cost + tip_cost + tax_cost)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val meal_cost = scan.nextLine().trim().toDouble()

    val tip_percent = scan.nextLine().trim().toInt()

    val tax_percent = scan.nextLine().trim().toInt()

    val total_cost = solve(meal_cost, tip_percent, tax_percent)
    println(total_cost)
}
