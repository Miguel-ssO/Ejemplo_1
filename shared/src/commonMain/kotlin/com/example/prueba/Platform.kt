package com.example.prueba

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform