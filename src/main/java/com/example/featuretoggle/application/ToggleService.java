package com.example.featuretoggle.application;

import io.getunleash.Unleash;
import org.springframework.stereotype.Service;

@Service
public class ToggleService {
    private final Unleash unleash;

    public ToggleService(Unleash unleash) {
        this.unleash = unleash;
    }

    public String getResult() {
        if (unleash.isEnabled("feature-001")) {
            return "feature-001";
        }
        else if (unleash.isEnabled("feature-002")) {
            return "feature-002";
        }
        return "old-feature";
    }
}
