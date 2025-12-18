package com.akshit945.project.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users") //User is keyword cannot use as table name
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    String email;
    String passwordHash;
    String name;

    String avatarUrl;
    @CreationTimestamp
    Instant createdAt;

    @UpdateTimestamp
    Instant updatedAt;

    Instant deletedAt; //soft delete
}
