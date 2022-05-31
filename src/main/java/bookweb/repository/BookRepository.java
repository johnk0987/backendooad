/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookweb.repository;

import bookweb.model.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PhucNguyen
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
    
    @Query( "select p from Book p where p.bookName like %?1%")
    public List<Book> searchBook(String keyword);
}
