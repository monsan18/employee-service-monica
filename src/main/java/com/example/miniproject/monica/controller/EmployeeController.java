package com.example.miniproject.monica.controller;

import com.example.miniproject.monica.dto.EmployeeHierarchyDTO;
import com.example.miniproject.monica.dto.EmployeeRequest;
import com.example.miniproject.monica.model.Employee;
import com.example.miniproject.monica.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/department/{dept}")
    public ResponseEntity<Map<String, Object>> getEmployeesByDepartment(@PathVariable String dept) {
        List<Employee> employees = employeeService.getEmployeesByDepartment(dept);

        Map<String, Object> response = new HashMap<>();
        response.put("response", "OK");
        response.put("data", employees);

        return ResponseEntity.ok(response);
    }

    // add new employee function.
    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> addEmployee(@RequestBody EmployeeRequest request) {
        Employee savedEmployee = employeeService.addEmployee(request);

        Map<String, Object> response = new HashMap<>();
        response.put("response", "Employee Added Successfully");
        response.put("data", savedEmployee);

        return ResponseEntity.ok(response);
    }

    // get employee hierarchy function.
    @GetMapping("/hierarchy")
    public ResponseEntity<Map<String, Object>> getEmployeeHierarchy() {
        List<EmployeeHierarchyDTO> hierarchy = employeeService.getEmployeeHierarchy();

        Map<String, Object> response = new HashMap<>();
        response.put("response", "OK");
        response.put("data", hierarchy);

        return ResponseEntity.ok(response);
    }
}
