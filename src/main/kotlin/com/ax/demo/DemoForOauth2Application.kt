package com.ax.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoForOauth2Application

fun main(args: Array<String>) {
	runApplication<DemoForOauth2Application>(*args)
}
