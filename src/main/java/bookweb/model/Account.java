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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PhucNguyen
 */
@Entity
@Table(name = "account")
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findByAccountID", query = "SELECT a FROM Account a WHERE a.accountID = :accountID"),
    @NamedQuery(name = "Account.findByAccountName", query = "SELECT a FROM Account a WHERE a.accountName = :accountName"),
    @NamedQuery(name = "Account.findByAccountPass", query = "SELECT a FROM Account a WHERE a.accountPass = :accountPass"),
    @NamedQuery(name = "Account.findByAccountRole", query = "SELECT a FROM Account a WHERE a.accountRole = :accountRole")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountID")
    private Integer accountID;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_pass")
    private String accountPass;
    @Column(name = "account_role")
    private Integer accountRole;
    @OneToMany(mappedBy = "accountID", fetch = FetchType.LAZY)
    private List<User> userList;
    
    

    public Account(Integer accountID, String accountName, String accountPass, Integer accountRole,
			List<User> userList) {
		super();
		this.accountID = accountID;
		this.accountName = accountName;
		this.accountPass = accountPass;
		this.accountRole = accountRole;
		this.userList = userList;
	}

	public Account() {
    }

    public Account(Integer accountID) {
        this.accountID = accountID;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPass() {
        return accountPass;
    }

    public void setAccountPass(String accountPass) {
        this.accountPass = accountPass;
    }

    public Integer getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(Integer accountRole) {
        this.accountRole = accountRole;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Account[ accountID=" + accountID + " ]";
    }
    
}
