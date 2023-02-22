package lms_127

fun task9(sentence: String, character: Char): Boolean {
    val sentence = "I code In KOTLIN"
    val result = sentence.contains('i', ignoreCase = true)
    return result
}
fun main ()  {
    val result = task9("I code In KOTLIN",'i')
    println("The letter is present $result times")


}