package ru.boblak.sandbox.exception

class NotFoundException(
    message: String,
    code: String? = null
) : ApplicationException(message, code)
