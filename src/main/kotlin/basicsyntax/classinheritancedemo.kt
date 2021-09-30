package basicsyntax

/**
 *
 */
open class Shape

class Circle(var radius: Double, val PI: Double = 3.142) : Shape() {
    var perimeter = (2 * PI * radius)
}

fun main() {
    val circle = Circle(7.0)
    println("The perimeter of the circle is: ${circle.perimeter}")
}

