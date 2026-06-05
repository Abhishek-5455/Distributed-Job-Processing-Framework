package com.fusion.jobprocessing.controller;


import com.fusion.jobprocessing.dto.JobRequest;
import com.fusion.jobprocessing.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping
    public UUID submit(@RequestBody JobRequest jobRequest) {
        return jobService.submit(jobRequest);
    }
}
