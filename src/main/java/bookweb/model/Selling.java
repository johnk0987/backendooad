/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookweb.model;

import java.io.Serializable;
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
import javax.persistence.Table;

/**
 *
 * @author PhucNguyen
 */
@Entity
@Table(name = "selling")
@NamedQueries({ @NamedQuery(name = "Selling.findAll", query = "SELECT s FROM Selling s"),
		@NamedQuery(name = "Selling.findBySellID", query = "SELECT s FROM Selling s WHERE s.sellID = :sellID"),
		@NamedQuery(name = "Selling.findBySellStatus", query = "SELECT s FROM Selling s WHERE s.sellStatus = :sellStatus") })
public class Selling implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sellID")
	private Integer sellID;
	@Column(name = "sell_status")
	private Integer sellStatus;
	@JoinColumn(name = "bookID", referencedColumnName = "bookID")
	@ManyToOne(fetch = FetchType.LAZY)
	private Book bookID;
//	@JoinColumn(name = "userID", referencedColumnName = "userID")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private User userID;

	public Selling(Integer sellID, Integer sellStatus, Book bookID) {
		super();
		this.sellID = sellID;
		this.sellStatus = sellStatus;
		this.bookID = bookID;
	}

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

	public Integer getSellStatus() {
		return sellStatus;
	}

	public void setSellStatus(Integer sellStatus) {
		this.sellStatus = sellStatus;
	}

	public Book getBookID() {
		return bookID;
	}

	public void setBookID(Book bookID) {
		this.bookID = bookID;
	}

//	public User getUserID() {
//		return userID;
//	}
//
//	public void setUserID(User userID) {
//		this.userID = userID;
//	}

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
		if ((this.sellID == null && other.sellID != null)
				|| (this.sellID != null && !this.sellID.equals(other.sellID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Selling[ sellID=" + sellID + " ]";
	}

}
