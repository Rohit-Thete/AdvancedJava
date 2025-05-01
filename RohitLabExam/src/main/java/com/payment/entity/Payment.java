package com.payment.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PaymentDetails")
public class Payment {
	//paymentId, amount, paymentMethod, paymentDate, paymentStatus
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	@Column(name="amount")
	private Double amount;
	@Column(name="payment_Method",length = 50)
	private String paymentMethod;
	
	@Column(name="payment_Date")
	private LocalDate paymentDate;
	@Column(name="payment_Status")
	private Boolean paymentStatus;
	
	
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}



	public Payment(Integer paymentId, Double amount, String paymentMethod, LocalDate paymentDate,
			Boolean paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
	}



	public Integer getPaymentId() {
		return paymentId;
	}



	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}



	public Double getAmount() {
		return amount;
	}



	public void setAmount(Double amount) {
		this.amount = amount;
	}



	public String getPaymentMethod() {
		return paymentMethod;
	}



	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}



	public LocalDate getPaymentDate() {
		return paymentDate;
	}



	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}



	public Boolean getPaymentStatus() {
		return paymentStatus;
	}



	public void setPaymentStatus(Boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}



	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", paymentMethod=" + paymentMethod
				+ ", paymentDate=" + paymentDate + ", paymentStatus=" + paymentStatus + "]";
	}
	
	
	

}
