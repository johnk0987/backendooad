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
@Table(name = "orderdetail")
@NamedQueries({ @NamedQuery(name = "Orderdetail.findAll", query = "SELECT o FROM Orderdetail o"),
		@NamedQuery(name = "Orderdetail.findByOrderdetailID", query = "SELECT o FROM Orderdetail o WHERE o.orderdetailID = :orderdetailID"),
		@NamedQuery(name = "Orderdetail.findByOrderdetailAmount", query = "SELECT o FROM Orderdetail o WHERE o.orderdetailAmount = :orderdetailAmount"),
		@NamedQuery(name = "Orderdetail.findByOrderdetailTotalorderdetail", query = "SELECT o FROM Orderdetail o WHERE o.orderdetailTotalorderdetail = :orderdetailTotalorderdetail") })
public class Orderdetail implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderdetailID")
	private Integer orderdetailID;
	@Column(name = "orderdetail_amount")
	private Integer orderdetailAmount;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "orderdetail_totalorderdetail")
	private Double orderdetailTotalorderdetail;
//	@JoinColumn(name = "orderID", referencedColumnName = "orderID")
//	@ManyToOne(fetch = FetchType.LAZY)
//	private Orders orderID;

	public Orderdetail(Integer orderdetailID, Integer orderdetailAmount, Double orderdetailTotalorderdetail) {
		super();
		this.orderdetailID = orderdetailID;
		this.orderdetailAmount = orderdetailAmount;
		this.orderdetailTotalorderdetail = orderdetailTotalorderdetail;
	}

	public Orderdetail() {
	}

	public Orderdetail(Integer orderdetailID) {
		this.orderdetailID = orderdetailID;
	}

	public Integer getOrderdetailID() {
		return orderdetailID;
	}

	public void setOrderdetailID(Integer orderdetailID) {
		this.orderdetailID = orderdetailID;
	}

	public Integer getOrderdetailAmount() {
		return orderdetailAmount;
	}

	public void setOrderdetailAmount(Integer orderdetailAmount) {
		this.orderdetailAmount = orderdetailAmount;
	}

	public Double getOrderdetailTotalorderdetail() {
		return orderdetailTotalorderdetail;
	}

	public void setOrderdetailTotalorderdetail(Double orderdetailTotalorderdetail) {
		this.orderdetailTotalorderdetail = orderdetailTotalorderdetail;
	}

//	public Orders getOrderID() {
//		return orderID;
//	}
//
//	public void setOrderID(Orders orderID) {
//		this.orderID = orderID;
//	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (orderdetailID != null ? orderdetailID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Orderdetail)) {
			return false;
		}
		Orderdetail other = (Orderdetail) object;
		if ((this.orderdetailID == null && other.orderdetailID != null)
				|| (this.orderdetailID != null && !this.orderdetailID.equals(other.orderdetailID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Orderdetail[ orderdetailID=" + orderdetailID + " ]";
	}

}
