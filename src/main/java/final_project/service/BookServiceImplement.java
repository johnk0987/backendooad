/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project.service;

import final_project.model.Book;
import final_project.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PhucNguyen
 */
@Service
public class BookServiceImplement implements BookService{

    @Autowired
    private BookRepository bookRepository;
    
    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int id) {
       return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book saveBook(Book book) {
       return bookRepository.save(book);
    }

    @Override
    public String deleteBook(int id) {
        return "Đã xóa thành công !";
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> saveListBook(List<Book> listBook) {
        return bookRepository.saveAllAndFlush(listBook);
    }

    @Override
    public List<Book> searchBook(String keyword) {    
        return bookRepository.searchBook(keyword);
    }
    
}
