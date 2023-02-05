package lms_126

fun task11(): String {

    return """
        Convert temperatures from "Celcius" to "Farenheit"
        INPUT F
        STEP C = (F - 32) / (1.8)
        print C
        INPUT C
        STEP F = (C * 1.8) + 32 
        print F 
        
    """
        .trimIndent()
}
