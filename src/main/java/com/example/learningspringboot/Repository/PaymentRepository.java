package com.example.learningspringboot.Repository;

import com.example.learningspringboot.DTO.PaymentRequest;
import com.example.learningspringboot.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity paymentModel = executeQuery(request);
        return paymentModel;
    }

    private PaymentEntity executeQuery(PaymentRequest request){

        // connect with db & fetch data
        PaymentEntity payment = new PaymentEntity();
        payment.setId(request.getPaymentId());
        payment.setPaymentCurrency("INR");
        payment.setAmount(30000.90);
        payment.setUserEmail("abc@xyz.com");
        return payment;
    }
}
