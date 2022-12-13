package com.narla

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NarlaApplication

fun main(args: Array<String>) {
    runApplication<NarlaApplication>(*args)
}
