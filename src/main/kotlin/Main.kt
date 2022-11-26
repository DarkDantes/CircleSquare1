import kotlin.math.*

fun main(args: Array<String>) {

// PI const из math
// Площадь круга
    println("Circle's Square")
    println("Enter Radius:")
    val radius = readln().toFloat()

    val square = PI * radius.pow(2)


    println("Result: " + square)

}