package basicsyntax.nullablechecks

private fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

private fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using 'x * y' yield errors because they may hold null
    if (x != null && y != null) {
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun main() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}