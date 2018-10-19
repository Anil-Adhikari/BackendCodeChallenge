package com.anil.codechallenge.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.codechallenge.entities.ApplicationDetail;

@Repository
public interface ApplicationDetailRepository extends JpaRepository<ApplicationDetail, Integer>{

}
