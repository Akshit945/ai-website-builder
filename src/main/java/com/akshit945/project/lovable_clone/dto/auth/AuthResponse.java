package com.akshit945.project.lovable_clone.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {

}
