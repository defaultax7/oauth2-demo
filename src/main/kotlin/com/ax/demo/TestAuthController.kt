package com.ax.demo

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.jwt.Jwt
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestAuthController {
    @GetMapping("/test")
    fun test(@AuthenticationPrincipal principal : Jwt): String {
        return "ok"
    }

}