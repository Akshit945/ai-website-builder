package com.akshit945.project.lovable_clone.service.impl;

import com.akshit945.project.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.akshit945.project.lovable_clone.dto.subscription.UsageTodayResponse;
import com.akshit945.project.lovable_clone.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        // TODO: Implement this method to fetch today's usage for the user
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        // TODO: Implement this method to fetch current subscription limits for the user
        return null;
    }
}
