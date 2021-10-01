package idioms

var x = 1
var y = 2

fun main() {
    x = y.also { y = x }
}