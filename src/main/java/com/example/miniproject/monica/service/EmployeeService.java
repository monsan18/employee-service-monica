package com.example.miniproject.monica.service;

import com.example.miniproject.monica.model.Employee;
import com.example.miniproject.monica.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.miniproject.monica.dto.EmployeeHierarchyDTO;
import com.example.miniproject.monica.dto.EmployeeRequest;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getEmployeesByDepartment(String department) {
        List<Employee> employees = repository.findEmployeesByDepartment(department);
        return employees != null ? employees : List.of();
    }

    // add new employee.
    public Employee addEmployee(EmployeeRequest request) {
        Employee employee = new Employee(request.getName(), request.getEmail(), request.getDepartmentId(),
                request.getEmploymentStatus(), request.getDob());
        return repository.save(employee);
    }

    // get hierarchy employee.
    public List<EmployeeHierarchyDTO> getEmployeeHierarchy() {
        List<Object[]> results = repository.getHierarchy();
        return results.stream()
                .map(obj -> new EmployeeHierarchyDTO(
                        ((Number) obj[0]).longValue(),
                        (String) obj[1],
                        (String) obj[2],
                        (String) obj[3]))
                .collect(Collectors.toList());
    }
}
