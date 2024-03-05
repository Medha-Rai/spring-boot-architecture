package com.example.learningspringboot.Service;

import com.example.learningspringboot.DTO.PaymentRequest;
import com.example.learningspringboot.DTO.PaymentResponse;
import com.example.learningspringboot.Entity.PaymentEntity;
import com.example.learningspringboot.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public PaymentResponse getPaymentDetailsById(PaymentRequest request){
        PaymentEntity entity = paymentRepository.getPaymentById(request);

        // got the payment details, now map it to payment DTO
        PaymentResponse response = mapModelToResponseDTO(entity);
        return response;
    }

    private PaymentResponse mapModelToResponseDTO(PaymentEntity entity){
        PaymentResponse response = new PaymentResponse();

        response.setPaymentId(entity.getId());
        response.setAmount(entity.getAmount());
        response.setCurrency(response.getCurrency());
        return response;
    }
}
