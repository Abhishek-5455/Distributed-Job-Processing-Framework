package com.fusion.jobprocessing.service;


import com.fusion.jobprocessing.dto.JobRequest;
import com.fusion.jobprocessing.entity.Job;
import com.fusion.jobprocessing.entity.JobStatus;
import com.fusion.jobprocessing.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public UUID submit(JobRequest request) {
        Job job = new Job();

        job.setId(UUID.randomUUID());
        job.setType(request.type());
        job.setPriority(request.priority());
        job.setStatus(JobStatus.PENDING);
        job.setAttempts(0);
        job.setMaxAttempts(3); // Default max attempts, can be made configurable
        job.setPayload(request.payload());

        jobRepository.save(job);

        return job.getId();
    }
}
