package com.fusion.jobprocessing.repository;

import com.fusion.jobprocessing.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<Job, UUID> {

}
