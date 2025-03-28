package com.example.miniproject.monica.dto;

public class EmployeeHierarchyDTO {

    private Long employeeId;
    private String employeeName;
    private String managerName;
    private String pathHierarchy;

    // Constructor
    public EmployeeHierarchyDTO(Long employeeId, String employeeName, String managerName, String pathHierarchy) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.managerName = managerName;
        this.pathHierarchy = pathHierarchy;
    }

    // Getters and Setters
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPathHierarchy() {
        return pathHierarchy;
    }

    public void setPathHierarchy(String pathHierarchy) {
        this.pathHierarchy = pathHierarchy;
    }

}
