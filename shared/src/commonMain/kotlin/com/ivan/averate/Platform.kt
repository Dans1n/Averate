package com.ivan.averate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform