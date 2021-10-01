package idioms

import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Paths


val stream: InputStream = Files.newInputStream(Paths.get("/some/file.txt"))

fun main() {
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}