/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project.service;

import final_project.model.Book;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface BookService {
    public List<Book> getAll();
    public Book getBookById(int id);
    public Book saveBook(Book book);
    public List<Book> saveListBook(List<Book> listBook);
    public String deleteBook(int id);
    public Book updateBook(Book book);
    public List<Book> searchBook(String keyword);
}
