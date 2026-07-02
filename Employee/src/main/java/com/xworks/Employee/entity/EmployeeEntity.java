package com.xworks.Employee.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="employee_info")
@Getter
@Setter
@ToString
@NamedQuery(name="getAllName",query="select e.name from EmployeeEntity e")
@NamedQuery(name="getAllDepartment",query="select e.department from EmployeeEntity e")
@NamedQuery(name="getNameAndPrice",query="select  e.name,e.salary from EmployeeEntity e")
@NamedQuery(name="getAllEmployee",query="select e.name,e.department,e.salary from EmployeeEntity e")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="department")
    private String department;
    @Column(name="salary")
    private double salary;

}
