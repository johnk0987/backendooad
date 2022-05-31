/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookweb.controller;

import bookweb.model.Book;
import bookweb.service.BookServiceImplement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PhucNguyen
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServiceImplement bookServiceImplement;

    @CrossOrigin
    @GetMapping("/getAll")
    public List<Book> getAll() {
        return bookServiceImplement.getAll();
    }

    @CrossOrigin
    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookServiceImplement.getBookById(id);
    }

    @CrossOrigin
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookServiceImplement.saveBook(book);
    }

    @CrossOrigin
    @PostMapping("/addListBook")
    public List<Book> addListAccount(@RequestBody List<Book> listBook) {
        return bookServiceImplement.saveListBook(listBook);
    }

    @CrossOrigin
    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id) {
        return bookServiceImplement.deleteBook(id);
    }

    @CrossOrigin
    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book) {
        return bookServiceImplement.saveBook(book);
    }

    @CrossOrigin
    @RequestMapping("/searchBook")
    public List<Book> searchBook(@Param("keyword") String keyword) {
        return bookServiceImplement.searchBook(keyword);
    }
    
    @CrossOrigin
    @PutMapping("/updateListBook")
    public List<Book> updateListBook(@RequestBody List<Book> listBook) {
        return bookServiceImplement.saveListBook(listBook);
    }
}
