package org.example.repository;

import org.example.entities.JobList;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@EnableAutoConfiguration
@Repository
public interface JobListRepository extends JpaRepository<JobList, Long>{
}
