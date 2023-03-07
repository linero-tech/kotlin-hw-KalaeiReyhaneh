package lms_129

import kotlin.math.roundToInt

fun task9(temperature: String): String {

    val number = temperature.dropLast(n = 1).toInt()
    val result =
        when(temperature.last().toString().uppercase()){
            "C" -> {((1.8 * number + 32).roundToInt()).toString() +"F"}
            "F" -> {(( number -32) /1.8).roundToInt().toString() +"C"}
            else -> "temperature Invalid"
        }

    return (result)
}
fun main() {

    val temperature= task9("-30C")

    println("Assume that")
    println("¤ temperature is $temperature")
    println("Then")
    println("¤ result is " + task9(temperature))}