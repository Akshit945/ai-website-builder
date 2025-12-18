package com.akshit945.project.lovable_clone.service;

import com.akshit945.project.lovable_clone.dto.subscription.CheckoutRequest;
import com.akshit945.project.lovable_clone.dto.subscription.CheckoutResponse;
import com.akshit945.project.lovable_clone.dto.subscription.PortalResponse;
import com.akshit945.project.lovable_clone.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
