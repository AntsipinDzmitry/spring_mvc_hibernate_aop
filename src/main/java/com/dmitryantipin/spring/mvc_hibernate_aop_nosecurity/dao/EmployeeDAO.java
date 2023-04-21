package com.dmitryantipin.spring.mvc_hibernate_aop_nosecurity.dao;

import com.dmitryantipin.spring.mvc_hibernate_aop_nosecurity.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
