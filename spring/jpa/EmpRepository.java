package com.spring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
