package idioms

fun test() {
    val result = try {
        count()
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
    // working with results
}


fun count(): Unit { TODO() }
