package com.akshit945.project.lovable_clone.service.impl;

import com.akshit945.project.lovable_clone.dto.auth.UserProfileResponse;
import com.akshit945.project.lovable_clone.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserProfileResponse getProfile(Long userId) {
        // TODO: Implement this method to fetch user profile from the database
        return null;
    }
}
