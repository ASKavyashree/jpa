package com.xworks.Employee.repo.Impl;

import com.xworks.Employee.repo.EmployeeRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class EmployeeRepoImplementation implements EmployeeRepo {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("something");

    @Override
    public List<String> getAllName() {
        System.out.println("Invoking a getEmployeeName in EmployeeRepoImplementation");
        List<String> list=Collections.emptyList();
        EntityManager em =null;
        try{
          em= emf.createEntityManager();
          Query query=em.createNamedQuery("getAllName");
          list=query.getResultList();
        }catch(RuntimeException e){
            e.printStackTrace();
        }finally{
            if(em!=null){
                em.close();
            }
        }
        return list;
    }

    @Override
    public List<Object> getdepartment() {
        System.out.println("Invoking a getDepartment in EmployeeRepoImplementation");
        List<Object> list=Collections.emptyList();
        EntityManager em =null;
        try{
            em= emf.createEntityManager();
            Query query=em.createNamedQuery("getAllDepartment");
            list=query.getResultList();
        }catch(RuntimeException e){
            e.printStackTrace();
        }finally{
            if(em!=null){
                em.close();
            }
        }
        return list;
    }

    @Override
    public List<Object[]> getNameAndPrice() {
        System.out.println("Invoking a getNameAndPrice in EmployeeRepoImplementation");
        List<Object[]> list=Collections.emptyList();
        EntityManager em =null;
        try{
            em= emf.createEntityManager();
            Query query=em.createNamedQuery("getNameAndPrice");
            list=query.getResultList();
        }catch(RuntimeException e){
            e.printStackTrace();
        }finally{
            if(em!=null){
                em.close();
            }
        }
        return list;
    }

    @Override
    public List<List<Object[]>> getAllEmployee() {
        System.out.println("Invoking a getAllEmployee in EmployeeRepoImplementation");
        List<List<Object[]>> list= Collections.emptyList();
        EntityManager em=null;
        try{
            em= emf.createEntityManager();
            Query query=em.createNamedQuery("getAllEmployee");
            list=query.getResultList();
        }catch(RuntimeException e){
            e.printStackTrace();
        }finally {
            if(em!=null){
                em.close();
            }
        }
        return list;
    }
}
