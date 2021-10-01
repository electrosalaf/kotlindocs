package idioms

data class Client(val name: String, val email: String)


/**
 * Default Values for Function Parameters
 */
fun foo(a: Int = 0, b: String = "") {}


/**
 * Filter a List
 */
val list = listOf(1, 2, 3)
val positives = list.filter { x -> x > 0 }

// Or even shorter
val positives1 = list.filter { it > 0 }


/**
 * Check the presence of an element in a collection
 */
val emailList = listOf("john@gmail.com", "jane@gmail.com")

fun main() {

    if ("john@gmail.com" in emailList) {}

    if ("janet@gmail.com" !in emailList) {}
}




