package com.example.hr.job;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository repo;

    public JobService(JobRepository repo) {
        this.repo = repo;
    }

    public Job createJob(Job job) {
        return repo.save(job);
    }

    public List<Job> allJobs() {
        return repo.findAll();
    }

    public void delete(Job job) {
        repo.delete(job);
    }

    public Job getJob(Integer id) {
        return repo.findById(id).get();
    }
}
