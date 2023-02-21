package lms_127

fun task8(sentence: String, character: Char): Int {
    val sentence = "I code in KOTLIN"
    val letterCounter = sentence.count{it == 'I'}


    return letterCounter
}
fun main() {
    val result = task8("I code in KOTLIN", 'I')
    println("The letter is present $result times")
}