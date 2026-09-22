package com.zoungrana.charly.tp1implementationmicroservice.web;

import com.zoungrana.charly.tp1implementationmicroservice.dtos.BankAccountRequestDTO;
import com.zoungrana.charly.tp1implementationmicroservice.dtos.BankAccountResponseDTO;
import com.zoungrana.charly.tp1implementationmicroservice.entities.BankAccount;
import com.zoungrana.charly.tp1implementationmicroservice.repositories.BankAccountRepository;
import com.zoungrana.charly.tp1implementationmicroservice.service.BankAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * @author Charly Zoungrana
 * @created 22/09/2026
 * @time 00:47
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AccountRestController {
    private final BankAccountRepository bankAccountRepository;
    private final BankAccountService bankAccountService;

    @GetMapping("/bankAccounts")
    public List<BankAccount> bankAccounts(){
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccounts/{id}")
    public BankAccount bankAccount(@PathVariable  UUID id){
        return bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("BankAccount %s not found",id)));
    }

    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO save(@RequestBody BankAccountRequestDTO bankAccountRequestDTO){

        return bankAccountService.addAccount(bankAccountRequestDTO);
    }

    @PutMapping("/bankAccounts/{id}")
    public BankAccountResponseDTO update(@PathVariable UUID id,@RequestBody BankAccountRequestDTO bankAccount){

        return bankAccountService.updateAccount(id,bankAccount);
    }

    @DeleteMapping("/bankAccounts/{id}")
    public void delete(@PathVariable UUID id){
        bankAccountRepository.deleteById(id);
    }

}
