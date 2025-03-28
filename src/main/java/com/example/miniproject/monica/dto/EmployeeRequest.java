package com.example.miniproject.monica.dto;

import java.time.LocalDate;
import java.util.*;

public class EmployeeRequest {
    private String name;
    private String email;
    private Long departmentId;
    private String employmentStatus;
    private LocalDate dob;

    public EmployeeRequest() {
    }

    public EmployeeRequest(String name, String email, Long departmentId, String employmentStatus, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
        this.employmentStatus = employmentStatus;
        this.dob = dob;
    }

    // ✅ Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
