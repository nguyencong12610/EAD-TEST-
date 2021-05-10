package com.example.enterprise_application.repository;

import com.example.enterprise_application.jpa.core.JobHistory;
import com.example.enterprise_application.jpa.core.JobHistoryID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryID> {
}
