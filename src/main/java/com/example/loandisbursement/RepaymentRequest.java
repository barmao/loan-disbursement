package com.example.loandisbursement;

public record RepaymentRequest(String transaction_code,
                               String amount,
                               String payment_date,
                               String loan_code) {
}
