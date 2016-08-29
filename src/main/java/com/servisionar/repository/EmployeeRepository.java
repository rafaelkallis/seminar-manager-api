package com.servisionar.repository;

import com.servisionar.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by rafaelkallis on 27.08.16.
 */
@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, String>, BaseRepository<Employee> {
}
