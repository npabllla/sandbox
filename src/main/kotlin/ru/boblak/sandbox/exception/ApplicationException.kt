package ru.boblak.sandbox.exception

open class ApplicationException(
    message: String,
    val code: String? = null
) : RuntimeException(message)
