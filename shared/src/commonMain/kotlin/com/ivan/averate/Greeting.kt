package com.ivan.averate

import com.ivan.averate.Platform
import com.ivan.averate.getPlatform

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}