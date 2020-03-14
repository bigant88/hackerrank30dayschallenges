import java.util.*

open class People(initialAge: Int) {
    private var age: Int = 0

    init {
        age = initialAge
        if (age < 0) {
            println("Age is not valid, setting age to 0.")
            age = 0
        }
    }

    fun amIOld() {
        when {
            age < 13 -> println("You are young.")
            age in 13..17 -> println("You are a teenager.")
            else -> println("You are old.")
        }
    }

    fun yearPasses() {
        age++
    }
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    for (i in 0 until t) {
        val age = sc.nextInt()
        val p = People(age)
        p.amIOld()
        for (j in 0..2) {
            p.yearPasses()
        }
        p.amIOld()
        println()
    }
    sc.close()
}