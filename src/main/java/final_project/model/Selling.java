/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project.model;

import final_project.model.User;
import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PhucNguyen
 */
@Entity
@Table(name = "selling")
@NamedQueries({
    @NamedQuery(name = "Selling.findAll", query = "SELECT s FROM Selling s"),
    @NamedQuery(name = "Selling.findBySellID", query = "SELECT s FROM Selling s WHERE s.sellID = :sellID"),
    @NamedQuery(name = "Selling.findByBookName", query = "SELECT s FROM Selling s WHERE s.bookName = :bookName"),
    @NamedQuery(name = "Selling.findByBookPrice", query = "SELECT s FROM Selling s WHERE s.bookPrice = :bookPrice"),
    @NamedQuery(name = "Selling.findByBookImage", query = "SELECT s FROM Selling s WHERE s.bookImage = :bookImage"),
    @NamedQuery(name = "Selling.findByAuthorName", query = "SELECT s FROM Selling s WHERE s.authorName = :authorName"),
    @NamedQuery(name = "Selling.findByPublisher", query = "SELECT s FROM Selling s WHERE s.publisher = :publisher"),
    @NamedQuery(name = "Selling.findByPublisDate", query = "SELECT s FROM Selling s WHERE s.publisDate = :publisDate"),
    @NamedQuery(name = "Selling.findByBookDescription", query = "SELECT s FROM Selling s WHERE s.bookDescription = :bookDescription"),
    @NamedQuery(name = "Selling.findBySellStatus", query = "SELECT s FROM Selling s WHERE s.sellStatus = :sellStatus")})
public class Selling implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sellID")
    private Integer sellID;

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
    @Column(name = "sell_status")
    private Integer sellStatus;
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    @ManyToOne
    private User userID;

    public Selling() {
    }

    public Selling(Integer sellID) {
        this.sellID = sellID;
    }

    public Integer getSellID() {
        return sellID;
    }

    public void setSellID(Integer sellID) {
        this.sellID = sellID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
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

    public Integer getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sellID != null ? sellID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Selling)) {
            return false;
        }
        Selling other = (Selling) object;
        if ((this.sellID == null && other.sellID != null) || (this.sellID != null && !this.sellID.equals(other.sellID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Selling[ sellID=" + sellID + " ]";
    }
    
}
