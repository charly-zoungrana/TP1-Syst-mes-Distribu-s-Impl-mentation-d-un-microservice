package com.zoungrana.charly.tp1implementationmicroservice.web;

import com.zoungrana.charly.tp1implementationmicroservice.dtos.BankAccountRequestDTO;
import com.zoungrana.charly.tp1implementationmicroservice.dtos.BankAccountResponseDTO;
import com.zoungrana.charly.tp1implementationmicroservice.entities.BankAccount;
import com.zoungrana.charly.tp1implementationmicroservice.entities.Customer;
import com.zoungrana.charly.tp1implementationmicroservice.repositories.BankAccountRepository;
import com.zoungrana.charly.tp1implementationmicroservice.repositories.CustomerRepository;
import com.zoungrana.charly.tp1implementationmicroservice.service.BankAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

/**
 * @author Charly Zoungrana
 * @created 22/09/2026
 * @time 21:28
 */

@Controller
@RequiredArgsConstructor
public class BankAccountGraphQLController {

    private final BankAccountRepository bankAccountRepository;
    private final BankAccountService bankAccountService;
    private final CustomerRepository customerRepository;

    @QueryMapping
    public List<BankAccount> accountsList(){
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount accountById(@Argument UUID id){
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("BankAccount %s not found",id)));
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return bankAccountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument UUID id,@Argument BankAccountRequestDTO bankAccount){
        return bankAccountService.updateAccount(id,bankAccount);
    }

    @MutationMapping
    public void deleteAccount(@Argument UUID id){
        bankAccountRepository.deleteById(id);
    }

    @QueryMapping
    public List<Customer> customers(){
        return customerRepository.findAll();
    }

}

