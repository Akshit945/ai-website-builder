package com.akshit945.project.lovable_clone.dto.member;

import com.akshit945.project.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
