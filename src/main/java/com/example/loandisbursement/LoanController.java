package com.example.loandisbursement;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/loan")
public class LoanController {

    @PostMapping("/repay")
    public void repayLoan(@RequestBody RepaymentRequest repaymentRequest ){
        log.info("new payment request  {}", repaymentRequest);
    }

    @PostMapping("/request")
    public void requestLoan(@RequestBody LoanRequest loanRequest ){
        log.info("new loanRequest  {}", loanRequest);
    }
}
