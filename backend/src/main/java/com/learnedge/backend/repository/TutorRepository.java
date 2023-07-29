package com.learnedge.backend.repository;

import com.learnedge.backend.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<Tutor,Long> {
}
