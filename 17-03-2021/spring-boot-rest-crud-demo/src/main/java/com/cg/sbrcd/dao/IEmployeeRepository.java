package com.cg.sbrcd.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.sbrcd.entity.Department;
import com.cg.sbrcd.entity.Employee;

 

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{

	
	boolean existsByMobileNumber(String mobilenumber);
	boolean existsByEmail(String email);
	
	
	Employee findByMobileNumber(String mobileNumber);
	Employee findByEmail(String email);
	
	List<Employee> findAllByDept(Department dept);
	List<Employee> findAllByJoinDate(LocalDate joinDate);
	
	@Query("SELECT e from Employee e WHERE e.basic > :lb AND e.basic <:ub")
	List<Employee> findAllByBasicRange(double lb,double ub);

}