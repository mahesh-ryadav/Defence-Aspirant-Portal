package com.defence.portal.auth.controller;

import com.defence.portal.auth.dto.UserProfileDTO;
import com.defence.portal.auth.service.UserProfileService;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/profile")
public class UserProfileController {
    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping
    public ResponseEntity<UserProfileDTO> getCurrentUserProfile() {
        return ResponseEntity.ok(userProfileService.getCurrentUserProfile());
    }
}
