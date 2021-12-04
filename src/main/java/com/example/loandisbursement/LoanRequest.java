package com.example.loandisbursement;

public record LoanRequest(String transaction_id,
                                  String amount,
                                  String interest,
                          String loan_code,
                          String loan_date,
                          String loan_due_date) {

}
