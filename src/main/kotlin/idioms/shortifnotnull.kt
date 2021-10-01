package idioms

import java.io.File

/**
 * If-not-null and if-not-null-else shorthand
 */
val files = File("Test").listFiles()

val values: Nothing = TODO()
val email = values["email"] ?: throw IllegalStateException("Email is missing!")

fun main() {
    println(files?.size)    // size printed if the file is not  null

    println(files?.size ?: "empty")    // if files is null, this prints empty
}