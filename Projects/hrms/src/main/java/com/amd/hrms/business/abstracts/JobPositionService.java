package com.amd.hrms.business.abstracts;

import com.amd.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    void add(JobPosition jobPosition);
    List<JobPosition> getAll();
}