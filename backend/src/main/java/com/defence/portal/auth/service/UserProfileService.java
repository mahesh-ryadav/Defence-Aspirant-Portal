package com.defence.portal.auth.service;

import com.defence.portal.auth.dto.UserProfileDTO;
import com.defence.portal.examportal.repository.ExamAttemptRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserProfileService {

    private final ExamAttemptRepository examAttemptRepository;

    public UserProfileService(ExamAttemptRepository examAttemptRepository) {
        this.examAttemptRepository = examAttemptRepository;
    }

    public UserProfileDTO getCurrentUserProfile() {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication()
            .getPrincipal();

        long count = examAttemptRepository.countByUserId(userDetails.getId());

        UserProfileDTO profile = new UserProfileDTO();
        profile.setFullName(userDetails.getFullName());
        profile.setEmail(userDetails.getEmail());
        profile.setUsername(userDetails.getUsername());
        profile.setRoles(userDetails.getAuthorities().stream()
            .map(item -> item.getAuthority())
            .collect(Collectors.toList()));
        profile.setTotalTestsAttempted(count);

        return profile;
    }
}
