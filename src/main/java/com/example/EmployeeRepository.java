package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

//@RestResource(exported = false) our rest api not gonna exposed as REST API
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
	//using repository, we don't need to create controller anymore
	//@Query("SELECT e FROM Employee e where e.emp_id := emp_id") 
	public List<Employee> findByLastName(@Param("lastName") String lastName);
	public List<Employee> findByFirstName(@Param("firstName") String firstName);
}
