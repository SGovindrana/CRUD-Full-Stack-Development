package com.crudrepo.crud_repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudrepo.crud_repo.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
