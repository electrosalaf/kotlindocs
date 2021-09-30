package basicsyntax.typecheckandautocasts

private fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // 'obj' is automatically cast to 'String' in this branch
        return obj.length
    }
    // 'obj' is still of type 'Any' outside of the type-checked branch
    return null
}

fun main() {
    fun printLength(obj: Any) {
        println("Getting the length of '$obj'. Result: ${getStringLength(obj) ?: "Error: object is not a string"}")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}