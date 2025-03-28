package com.example.miniproject.monica.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.cglib.core.Local;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private Long departmentId;

    @Column(nullable = true)
    private double salary;

    @Column(nullable = true)
    private String phone;

    @Column(nullable = true)
    private String address;

    @Column(nullable = true)
    private int maritalStatus;

    @Column(nullable = false)
    private LocalDate dob;

    @Column(nullable = false)
    private String employmentStatus;

    @Column(nullable = true)
    private String noNpwp;

    @Column(nullable = true)
    private String noBpjs;

    @Column(nullable = true)
    private int managerId;

    public Employee() {
    }

    public Employee(String name, String email, Long departmentId, String employmentStatus, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
        this.employmentStatus = employmentStatus;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNoNpwp() {
        return noNpwp;
    }

    public void setNoNpwp(String noNpwp) {
        this.noNpwp = noNpwp;
    }

    public String getNoBpjs() {
        return noBpjs;
    }

    public void setNoBpjs(String noBpjs) {
        this.noBpjs = noBpjs;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

}
