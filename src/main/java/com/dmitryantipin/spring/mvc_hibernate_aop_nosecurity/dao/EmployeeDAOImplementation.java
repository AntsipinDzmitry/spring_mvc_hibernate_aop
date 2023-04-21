package com.dmitryantipin.spring.mvc_hibernate_aop_nosecurity.dao;

import com.dmitryantipin.spring.mvc_hibernate_aop_nosecurity.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO{

//    DAO must be able to connect to the database, for this a dependency is injected
    @Autowired
    private SessionFactory sessionFactory;

    public List<Employee> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class).getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {

        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {

        Session session = sessionFactory.getCurrentSession();
        Query<Employee> query = session.createQuery("delete from Employee where id =:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
