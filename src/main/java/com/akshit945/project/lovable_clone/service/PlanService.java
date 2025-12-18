package com.akshit945.project.lovable_clone.service;

import com.akshit945.project.lovable_clone.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
