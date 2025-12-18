package com.akshit945.project.lovable_clone.dto.project;

import java.time.Instant;

public record  ProjectSummaryResponse(
        Long id,
        String projectName,
        Instant createdAt,
        Instant updatedAt
) {
}
