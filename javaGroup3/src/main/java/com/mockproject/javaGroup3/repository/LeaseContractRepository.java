package com.mockproject.javaGroup3.repository;

import com.mockproject.javaGroup3.model.LeaseContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseContractRepository extends JpaRepository<LeaseContract, Integer> {
}
