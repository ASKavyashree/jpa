package com.xworks.Employee;

import com.xworks.Employee.repo.EmployeeRepo;
import com.xworks.Employee.repo.Impl.EmployeeRepoImplementation;

import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {

        EmployeeRepo employeeRepo= new EmployeeRepoImplementation();
//        List<String> list=employeeRepo.getAllName();
//          List<Object> list=employeeRepo.getdepartment();
//          List<Object[]> list =employeeRepo.getNameAndPrice();
//        for(Object[] a:list){
//            System.out.println(a[0] +","+a[1]);

//        }
        List<List<Object[]>> list=employeeRepo.getAllEmployee();
        for(List<Object[]> a:list){
            System.out.println(a[0] +","+a[1] +","+a[2]);
        }
    }
}
