package com.udyog.firstjobapp.job.impl;

import com.udyog.firstjobapp.job.Job;
import com.udyog.firstjobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class JobServiceImpl implements JobService {

    List<Job> jobs = new ArrayList<>();
    private Long id = 1L;

    @Override
    public List<Job> findAllJobs() {
        return jobs;
    }

    @Override
    public String createJob(Job job) {
        job.setJobId(id++);
        jobs.add(job);
        return "Job " + job.getJobId() + " added successfully";
    }

    @Override
    public Job getJobById(Long jobId) {
        for(Job job:jobs) {
            if(Objects.equals(job.getJobId(), jobId)) {
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean updateJobById(Long jobId, Job job) {
        for (Job jobData : jobs) {
            if(Objects.equals(jobData.getJobId(), jobId)) {
//                jobs.remove(jobData);
//                jobs.add(job);
                jobData.setJobDescription(job.getJobDescription());
                jobData.setJobTitle(job.getJobTitle());
                jobData.setJobLocation(job.getJobLocation());
                jobData.setMaximumSalary(job.getMaximumSalary());
                jobData.setMinimumSalary(job.getMinimumSalary());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteJobById(Long jobId) {
        for (Job jobData : jobs) {
            if(Objects.equals(jobData.getJobId(), jobId)) {
                jobs.remove(jobData);
                return true;
            }
        }
        return false;

    }
}
