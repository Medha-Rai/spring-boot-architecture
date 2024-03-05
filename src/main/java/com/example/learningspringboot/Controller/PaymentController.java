package com.example.learningspringboot.Controller;

import com.example.learningspringboot.DTO.PaymentRequest;
import com.example.learningspringboot.DTO.PaymentResponse;
import com.example.learningspringboot.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentDetailsById(@PathVariable Long id){

        // map incoming request to requestDTO
        PaymentRequest internalRequestObj = new PaymentRequest();
        internalRequestObj.setPaymentId(id);

        // pass this internal req obj to further layer for processing
        PaymentResponse paymentResponse = paymentService.getPaymentDetailsById(internalRequestObj);

        // return response DTO
        return ResponseEntity.ok(paymentResponse);

    }
}
