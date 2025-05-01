package com.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.entity.Payment;
import com.payment.service.PaymentService;

@RestController

public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;

	//http://localhost:9000/add 
	 @PostMapping("/add")
	    public ResponseEntity<Payment> addPayment(@RequestBody Payment payment) {
	        Payment createdPayment = paymentService.addPayment(payment);
	        return new ResponseEntity<>(createdPayment, HttpStatus.CREATED);
	    }
	@GetMapping("/all")
	public List<Payment> getAllPayments(){
		return paymentService.getAllPayments();
	}

}
