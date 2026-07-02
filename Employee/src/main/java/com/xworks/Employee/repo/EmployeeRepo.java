package com.xworks.Employee.repo;

import java.util.List;

public interface EmployeeRepo {
    List<String> getAllName();
    List<Object> getdepartment();
    List<Object[]> getNameAndPrice();
    List<List<Object[]>> getAllEmployee();
}
