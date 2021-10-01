package idioms

/**
 * Map nullable value if not null
 */
val value: Nothing = TODO()

val defaultValue: Unit

val mapped = value?.let { transformValue() } ?: defaultValue


fun transformValue() {
    TODO("Not yet implemented")
}
