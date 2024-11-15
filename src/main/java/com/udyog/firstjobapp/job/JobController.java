package com.udyog.firstjobapp.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobs")
public class JobController {

    JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<Job>> getAllJobs() {
        //return ResponseEntity.of(Optional.ofNullable(jobService.findAllJobs())) ;
        return ResponseEntity.ok(jobService.findAllJobs());
    }

    @PostMapping
    public ResponseEntity<String> addJob(@RequestBody Job job) {
        return new ResponseEntity<>(jobService.createJob(job), HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        if(job != null) {
            return ResponseEntity.ok(jobService.getJobById(id));
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job job) {
        boolean updateResponse = jobService.updateJobById(id, job);
        if(updateResponse) {
            return new ResponseEntity<>("Job " + id + " updated successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Job not found",HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id) {
        boolean deleteStatus = jobService.deleteJobById(id);
        if(deleteStatus) {
            return new ResponseEntity<>("Job " + id + " deleted successfully",HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
