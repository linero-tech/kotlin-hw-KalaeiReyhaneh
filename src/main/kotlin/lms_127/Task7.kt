package lms_127

import kotlin.jvm.internal.Intrinsics.Kotlin

fun task7(sentence: String): Int {

val sentence = "I love GBG"
    val numberOfCharacters = sentence.length
    //println("The sentence has $numberOfCharacters characters")
    return numberOfCharacters
}
fun main()  {
    val result = task7("I love GBG")
    println("The sentence has $result characters")


}