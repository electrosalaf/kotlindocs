package idioms

import javafx.scene.shape.Rectangle
import java.awt.Color


/**
 * Configure the properties of an object (apply)
 * This is very useful for configuring properties that are in object constructor
 */


val myRectangle = Rectangle().apply {
    var length = 4
    var breadth = 5
    var color = 0xFAFAFA
}