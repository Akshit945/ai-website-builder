package com.akshit945.project.lovable_clone.service.impl;

import com.akshit945.project.lovable_clone.dto.subscription.PlanResponse;
import com.akshit945.project.lovable_clone.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Override
    public List<PlanResponse> getAllActivePlans() {
        // TODO: Implement this method to fetch active plans from the database
        return Collections.emptyList();
    }
}
