package com.xworks.bookstore.repository;

import com.xworks.bookstore.entity.BookStoreEntity;

import javax.persistence.*;

public class RepoImplementation implements Repository{

    EntityManagerFactory emf=null;
    EntityManager em=null;
    EntityTransaction et=null;
    public String saveDetails(BookStoreEntity bookStoreEntity) {
        try {
            emf = Persistence.createEntityManagerFactory("something");
            em=emf.createEntityManager();
            et=em.getTransaction();
            et.begin();
            em.persist(bookStoreEntity);
            et.commit();
        }catch(PersistenceException e){
            e.printStackTrace();
        }
        finally {
            if(emf!=null){
                emf.close();
            }
            if(em!=null){
                em.close();
            }

        }
        return "true";
    }
}
