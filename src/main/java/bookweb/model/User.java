/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookweb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    @NamedQuery(name = "User.findByUserIimage", query = "SELECT u FROM User u WHERE u.userIimage = :userIimage")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "userID")
    private Integer userID;

    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_age")
    private Integer userAge;

    @Column(name = "user_phoneNB")
    private String userphoneNB;

    @Column(name = "user_Iimage")
    private String userIimage;
    @OneToMany(mappedBy = "userID", fetch = FetchType.LAZY)
    private List<Orders> ordersList;
    @OneToMany(mappedBy = "userID", fetch = FetchType.LAZY)
    private List<Selling> sellingList;
//    @JoinColumn(name = "accountID", referencedColumnName = "accountID")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Account accountID;

    
    
    
    public User(Integer userID, String userName, Integer userAge, String userphoneNB, String userIimage,
			List<Orders> ordersList, List<Selling> sellingList) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userAge = userAge;
		this.userphoneNB = userphoneNB;
		this.userIimage = userIimage;
		this.ordersList = ordersList;
		this.sellingList = sellingList;
	}

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
        return userIimage;
    }

    public void setUserIimage(String userIimage) {
        this.userIimage = userIimage;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public List<Selling> getSellingList() {
        return sellingList;
    }

    public void setSellingList(List<Selling> sellingList) {
        this.sellingList = sellingList;
    }

//    public Account getAccountID() {
//        return accountID;
//    }
//
//    public void setAccountID(Account accountID) {
//        this.accountID = accountID;
//    }

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
