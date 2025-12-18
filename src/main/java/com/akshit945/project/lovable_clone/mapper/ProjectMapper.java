package com.akshit945.project.lovable_clone.mapper;

import com.akshit945.project.lovable_clone.dto.project.ProjectResponse;
import com.akshit945.project.lovable_clone.dto.project.ProjectSummaryResponse;
import com.akshit945.project.lovable_clone.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
