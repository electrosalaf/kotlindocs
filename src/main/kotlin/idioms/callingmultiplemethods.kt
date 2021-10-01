package idioms

/**
 * Call multiple methods on an object instance (with)﻿
 */
class Turtle {
    fun penDown() { TODO() }
    fun penUp() { TODO() }
    fun turn(degrees: Double) { TODO() }
    fun forward(pixels: Double) { TODO() }
}

fun main () {
    val myTurtle = Turtle()
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}
