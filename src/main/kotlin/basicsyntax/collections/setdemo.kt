package basicsyntax.collections

fun main() {
    val items = setOf("apple", "grape", "banana", "kiwifruit")

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}