package com.akshit945.project.lovable_clone.service.impl;

import com.akshit945.project.lovable_clone.dto.project.ProjectRequest;
import com.akshit945.project.lovable_clone.dto.project.ProjectResponse;
import com.akshit945.project.lovable_clone.dto.project.ProjectSummaryResponse;
import com.akshit945.project.lovable_clone.entity.Project;
import com.akshit945.project.lovable_clone.entity.User;
import com.akshit945.project.lovable_clone.mapper.ProjectMapper;
import com.akshit945.project.lovable_clone.service.ProjectService;
import com.akshit945.project.lovable_clone.service.repository.ProjectRepository;
import com.akshit945.project.lovable_clone.service.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;
    private  final ProjectMapper projectMapper;

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

        List<Project> projects=projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner=userRepository.findById(userId).orElseThrow();

        Project project=Project.builder().
                name(request.name()).
                owner(owner)
                .isPublic(false)
                .build();

        project=projectRepository.save(project);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
