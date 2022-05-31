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
@Table(name = "payment")
@NamedQueries({ @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
		@NamedQuery(name = "Payment.findByPaymentID", query = "SELECT p FROM Payment p WHERE p.paymentID = :paymentID"),
		@NamedQuery(name = "Payment.findByPaymentName", query = "SELECT p FROM Payment p WHERE p.paymentName = :paymentName"),
		@NamedQuery(name = "Payment.findByPaymentImage", query = "SELECT p FROM Payment p WHERE p.paymentImage = :paymentImage") })
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paymentID")
	private Integer paymentID;

	@Column(name = "payment_name")
	private String paymentName;

	@Column(name = "payment_image")
	private String paymentImage;
	@OneToMany(mappedBy = "paymentID", fetch = FetchType.LAZY)
	private List<Orders> ordersList;

	public Payment(Integer paymentID, String paymentName, String paymentImage, List<Orders> ordersList) {
		super();
		this.paymentID = paymentID;
		this.paymentName = paymentName;
		this.paymentImage = paymentImage;
		this.ordersList = ordersList;
	}

	public Payment() {
	}

	public Payment(Integer paymentID) {
		this.paymentID = paymentID;
	}

	public Integer getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(Integer paymentID) {
		this.paymentID = paymentID;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public String getPaymentImage() {
		return paymentImage;
	}

	public void setPaymentImage(String paymentImage) {
		this.paymentImage = paymentImage;
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (paymentID != null ? paymentID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Payment)) {
			return false;
		}
		Payment other = (Payment) object;
		if ((this.paymentID == null && other.paymentID != null)
				|| (this.paymentID != null && !this.paymentID.equals(other.paymentID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Payment[ paymentID=" + paymentID + " ]";
	}

}
