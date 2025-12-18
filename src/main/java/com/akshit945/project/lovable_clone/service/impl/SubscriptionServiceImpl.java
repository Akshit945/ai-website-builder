package com.akshit945.project.lovable_clone.service.impl;

import com.akshit945.project.lovable_clone.dto.subscription.CheckoutRequest;
import com.akshit945.project.lovable_clone.dto.subscription.CheckoutResponse;
import com.akshit945.project.lovable_clone.dto.subscription.PortalResponse;
import com.akshit945.project.lovable_clone.dto.subscription.SubscriptionResponse;
import com.akshit945.project.lovable_clone.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        // TODO: Implement this method to fetch the current subscription for the user
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        // TODO: Implement this method to create a checkout session URL
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        // TODO: Implement this method to open the customer portal
        return null;
    }
}
