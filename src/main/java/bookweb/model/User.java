/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookweb.model;

import java.io.Serializable;
import java.util.Collection;
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


/**
 *
 * @author PhucNguyen
 */
@Entity
@Table(name = "user")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findByUserID", query = "SELECT u FROM User u WHERE u.userID = :userID"),
    @NamedQuery(name = "User.findByUserName", query = "SELECT u FROM User u WHERE u.userName = :userName"),
    @NamedQuery(name = "User.findByUserAge", query = "SELECT u FROM User u WHERE u.userAge = :userAge"),
    @NamedQuery(name = "User.findByUserphoneNB", query = "SELECT u FROM User u WHERE u.userphoneNB = :userphoneNB"),
    @NamedQuery(name = "User.findByUserImage", query = "SELECT u FROM User u WHERE u.userImage = :userImage")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userID")
    private Integer userID;

    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_age")
    private Integer userAge;

    @Column(name = "user_phoneNB")
    private String userphoneNB;

    @Column(name = "user_image")
    private String userImage;
//    @OneToMany(mappedBy = "userID")
//    private Collection<Orders> ordersCollection;
//    @OneToMany(mappedBy = "userID")
//    private Collection<Selling> sellingCollection;
    @JoinColumn(name = "accountID", referencedColumnName = "accountID")
    @ManyToOne
    private Account accountID;

    public User() {
    }

    public User(Integer userID) {
        this.userID = userID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserphoneNB() {
        return userphoneNB;
    }

    public void setUserphoneNB(String userphoneNB) {
        this.userphoneNB = userphoneNB;
    }

    public String getUserIimage() {
        return userImage;
    }

    public void setUserIimage(String userImage) {
        this.userImage = userImage;
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

    public Account getAccountID() {
        return accountID;
    }

    public void setAccountID(Account accountID) {
        this.accountID = accountID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userID != null ? userID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userID == null && other.userID != null) || (this.userID != null && !this.userID.equals(other.userID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.User[ userID=" + userID + " ]";
    }
    
}
