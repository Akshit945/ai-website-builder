package com.akshit945.project.lovable_clone.service;

import com.akshit945.project.lovable_clone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
