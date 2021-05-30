package com.amd.hrms.api.controllers;

import com.amd.hrms.business.abstracts.JobPositionService;
import com.amd.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/jobPositions/")
public class JobPositionController {
    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService){
        this.jobPositionService = jobPositionService;
    }

    @PostMapping("add")
    public void add(JobPosition jobPosition){
        this.jobPositionService.add(jobPosition);
    }

    @GetMapping("getall")
    public List<JobPosition> getAll(){
        return this.jobPositionService.getAll();
    }
}