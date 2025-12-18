package com.akshit945.project.lovable_clone.service;

import com.akshit945.project.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.akshit945.project.lovable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
