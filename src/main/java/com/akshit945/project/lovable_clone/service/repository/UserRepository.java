package com.akshit945.project.lovable_clone.service.repository;

import com.akshit945.project.lovable_clone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
