package com.example.learningspringboot.DTO;

public class PaymentRequest {
    private long paymentId;

    public long getPaymentId(){
        return paymentId;
    }

    public void setPaymentId(long paymentId){
        this.paymentId = paymentId;
    }
}
