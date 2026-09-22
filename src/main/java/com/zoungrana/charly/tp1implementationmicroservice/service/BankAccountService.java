package com.zoungrana.charly.tp1implementationmicroservice.service;

import com.zoungrana.charly.tp1implementationmicroservice.dtos.BankAccountRequestDTO;
import com.zoungrana.charly.tp1implementationmicroservice.dtos.BankAccountResponseDTO;


/**
 * @author Charly Zoungrana
 * @created 22/09/2026
 * @time 12:57
 */
public interface BankAccountService {

    public BankAccountResponseDTO addAcount(BankAccountRequestDTO bankAccountDTO);
}
