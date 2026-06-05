package com.fusion.jobprocessing.dto;

public record JobRequest(
        String type,
        Integer priority,
        String payload
) { }
