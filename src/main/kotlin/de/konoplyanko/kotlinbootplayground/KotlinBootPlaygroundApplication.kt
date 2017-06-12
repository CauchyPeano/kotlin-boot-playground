package de.konoplyanko.kotlinbootplayground

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinBootPlaygroundApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinBootPlaygroundApplication::class.java, *args)
}
