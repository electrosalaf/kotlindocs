package idioms

val customerNames = listOf("Electron", "Major", "Hammy", "Soffy")

fun main() {

    if ("Electron" in customerNames) { }

    if ("Sharon" !in customerNames) { }
}