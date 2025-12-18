package com.akshit945.project.lovable_clone.service.impl;

import com.akshit945.project.lovable_clone.dto.member.InviteMemberRequest;
import com.akshit945.project.lovable_clone.dto.member.MemberResponse;
import com.akshit945.project.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.akshit945.project.lovable_clone.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        // TODO: Implement this method to get project members
        return Collections.emptyList();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        // TODO: Implement this method to invite a member to a project
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        // TODO: Implement this method to update a member's role in a project
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        // TODO: Implement this method to delete a member from a project
        return null;
    }
}
