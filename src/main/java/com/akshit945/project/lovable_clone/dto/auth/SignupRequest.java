package com.akshit945.project.lovable_clone.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
