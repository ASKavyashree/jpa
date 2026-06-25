package com.xworks.bookstore.service;

import com.xworks.bookstore.entity.BookStoreEntity;
import com.xworks.bookstore.repository.RepoImplementation;
import com.xworks.bookstore.repository.Repository;

public class ServiceImplementation implements BookService {
    @Override
    public String  saveDetails(BookStoreEntity bookStoreEntity) {

        Repository repository= new RepoImplementation();
        String result = repository.saveDetails(bookStoreEntity);
        System.out.println(result);
        if(result.equals("true")) {
            return "Data saved successfully";
        }else{
            return "Data not saved successfully";
        }
    }

}
