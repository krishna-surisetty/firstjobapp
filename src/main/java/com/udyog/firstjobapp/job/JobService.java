package com.udyog.firstjobapp.job;

import java.util.List;

public interface JobService {
    List<Job> findAllJobs();
    String createJob(Job job);
    Job getJobById(Long jobId);
    boolean updateJobById(Long jobId, Job job);
    boolean deleteJobById(Long jobId);
}
