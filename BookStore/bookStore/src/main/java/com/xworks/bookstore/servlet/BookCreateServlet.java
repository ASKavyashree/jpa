package com.xworks.bookstore.servlet;

import com.xworks.bookstore.entity.BookStoreEntity;
import com.xworks.bookstore.service.BookService;
import com.xworks.bookstore.service.ServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addBook",loadOnStartup = 1)
public class BookCreateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running a Book CreateServlet ");

        BookStoreEntity bookStoreEntity= new BookStoreEntity();
        BookService bookService= new ServiceImplementation();

        bookStoreEntity.setTitle(req.getParameter("title"));
        bookStoreEntity.setAuthor(req.getParameter("author"));
        bookStoreEntity.setPrice(Double.parseDouble(req.getParameter("price")));
        bookStoreEntity.setCategory(req.getParameter("category"));

        String result= bookService.saveDetails(bookStoreEntity);
        if (result.equals("Data saved successfully")){
            req.setAttribute("message",result);
            req.setAttribute("color","green");
        }else {
            req.setAttribute("message",result);
            req.setAttribute("color","red");
            req.setAttribute("book",bookStoreEntity);
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("createbook.jsp");
        requestDispatcher.forward(req,resp);
    }
}
