package com.payment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.payment.entity.Payment;
import com.payment.repository.PaymentRepository;
@Service
public class PaymentService {
	
	private PaymentRepository paymentRepo;

	  public Payment addPayment(Payment payment) {
	        return paymentRepo.save(payment);
	    }

	
	public List<Payment> getAllPayments() {
        return paymentRepo.findAll();
    }
	
	
	

}
