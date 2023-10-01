package com.example.featuretoggle.web;

import com.example.featuretoggle.application.ToggleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    private final ToggleService toggleService;

    public WebController(ToggleService toggleService) {
        this.toggleService = toggleService;
    }

    @GetMapping("/toggle")
    public String toggle() {
        return toggleService.getResult();
    }
}
