package com.fusion.jobprocessing.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "jobs")
public class Job {

    @Id
    private UUID id;

    private String type;

    private Integer priority;

    @Enumerated(EnumType.STRING)
    private JobStatus status;

    private Integer attempts;
    private Integer maxAttempts;

    @Column(columnDefinition = "TEXT")
    private String payload;
}
