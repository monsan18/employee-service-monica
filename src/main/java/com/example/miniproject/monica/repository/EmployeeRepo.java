package com.example.miniproject.monica.repository;

import com.example.miniproject.monica.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    // Native Query 1: find employees by department
    @Query(value = "SELECT * FROM employee WHERE department_id = ?1", nativeQuery = true)
    List<Employee> findEmployeesByDepartment(String department);

    // Native Query 2: Get Employee Hierarchy
    @Query(value = """
            WITH RECURSIVE EmployeeHierarchy AS (
                SELECT
                    e.id AS employee_id,
                    e.name AS employee_name,
                    m.name AS manager_name,
                    e.name AS path_hierarchy
                FROM employee e
                LEFT JOIN employee m ON e.manager_id = m.id
                WHERE e.manager_id IS NULL OR e.manager_id = 0

                UNION ALL

                SELECT
                    e.id AS employee_id,
                    e.name AS employee_name,
                    eh.employee_name AS manager_name,
                    CONCAT(eh.path_hierarchy, '->', e.name) AS path_hierarchy
                FROM employee e
                INNER JOIN EmployeeHierarchy eh ON e.manager_id = eh.employee_id
            )
            SELECT employee_id, employee_name, manager_name, path_hierarchy
            FROM EmployeeHierarchy
            ORDER BY path_hierarchy;
            """, nativeQuery = true)
    List<Object[]> getHierarchy();
}
