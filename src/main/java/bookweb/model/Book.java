/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookweb.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PhucNguyen
 */
@Entity
@Table(name = "book")
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findByBookID", query = "SELECT b FROM Book b WHERE b.bookID = :bookID"),
    @NamedQuery(name = "Book.findByBookName", query = "SELECT b FROM Book b WHERE b.bookName = :bookName"),
    @NamedQuery(name = "Book.findByBookPrice", query = "SELECT b FROM Book b WHERE b.bookPrice = :bookPrice"),
    @NamedQuery(name = "Book.findByAuthorName", query = "SELECT b FROM Book b WHERE b.authorName = :authorName"),
    @NamedQuery(name = "Book.findByPublisher", query = "SELECT b FROM Book b WHERE b.publisher = :publisher"),
    @NamedQuery(name = "Book.findByPublisDate", query = "SELECT b FROM Book b WHERE b.publisDate = :publisDate"),
    @NamedQuery(name = "Book.findByBookDescription", query = "SELECT b FROM Book b WHERE b.bookDescription = :bookDescription")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bookID")
    private Integer bookID;

    @Column(name = "book_name")
    private String bookName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "book_price")
    private Double bookPrice;

    @Column(name = "book_image")
    private String bookImage;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "publisher")
    private String publisher;
    @Column(name = "publis_date")
    @Temporal(TemporalType.DATE)
    private Date publisDate;
    @Column(name = "book_description")
    private String bookDescription;
//    @OneToMany(mappedBy = "bookID")
//    private Collection<Orders> ordersCollection;
//    @OneToMany(mappedBy = "bookID")
//    private Collection<Selling> sellingCollection;
    @ManyToOne
    @JoinColumn(name = "categoryID", referencedColumnName = "categoryID")
    private Category categoryID;

    public Book() {
    }

    public Book(Integer bookID) {
        this.bookID = bookID;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }
      

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublisDate() {
        return publisDate;
    }

    public void setPublisDate(Date publisDate) {
        this.publisDate = publisDate;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

//    public Collection<Orders> getOrdersCollection() {
//        return ordersCollection;
//    }
//
//    public void setOrdersCollection(Collection<Orders> ordersCollection) {
//        this.ordersCollection = ordersCollection;
//    }
//
//    public Collection<Selling> getSellingCollection() {
//        return sellingCollection;
//    }
//
//    public void setSellingCollection(Collection<Selling> sellingCollection) {
//        this.sellingCollection = sellingCollection;
//    }
    public Category getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Category categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookID != null ? bookID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.bookID == null && other.bookID != null) || (this.bookID != null && !this.bookID.equals(other.bookID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Book[ bookID=" + bookID + " ]";
    }

}
