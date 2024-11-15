package com.udyog.firstjobapp.job;

public class Job {
    private Long jobId;
    private String jobTitle;
    private String jobDescription;
    private int minimumSalary;
    private int maximumSalary;
    private String jobLocation;

    public Job(Long jobId, String jobTitle, String jobDescription, int minimumSalary, int maximumSalary, String jobLocation) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.minimumSalary = minimumSalary;
        this.maximumSalary = maximumSalary;
        this.jobLocation = jobLocation;
    }

    public Long getJobId() {
        return jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public int getMinimumSalary() {
        return minimumSalary;
    }

    public int getMaximumSalary() {
        return maximumSalary;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setMinimumSalary(int minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    public void setMaximumSalary(int maximumSalary) {
        this.maximumSalary = maximumSalary;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }
}
