package idioms

/**
 * Get the first item of a possibly empty collection
 */
val emails: String = TODO() // might be empty
val mainEmail = emails.firstOrNull() ?: ""
