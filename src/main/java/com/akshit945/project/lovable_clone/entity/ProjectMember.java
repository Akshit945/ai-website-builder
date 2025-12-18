package com.akshit945.project.lovable_clone.entity;

import com.akshit945.project.lovable_clone.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;

    Project project;

    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}
