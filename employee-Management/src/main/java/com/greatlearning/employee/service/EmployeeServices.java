package com.greatlearning.employee.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.employee.entity.Employee;
import com.greatlearning.employee.entity.Role;
import com.greatlearning.employee.entity.User;

public interface EmployeeServices {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

	public List<Employee> searchByFirstName(String firstName);

	public User saveUser(User user);

	public Role saveRole(Role role);

	List<Role> findAllRole();

	List<User> findAllUser();

	List<Employee> sortByFirstName(Direction direction);
}
