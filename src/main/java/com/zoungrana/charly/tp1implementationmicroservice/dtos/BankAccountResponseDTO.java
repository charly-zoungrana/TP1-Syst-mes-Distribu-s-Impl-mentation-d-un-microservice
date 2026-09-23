package com.zoungrana.charly.tp1implementationmicroservice.dtos;

import com.zoungrana.charly.tp1implementationmicroservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountResponseDTO {
    private UUID id;
    private LocalDate createdAt;
    private Double balance;
    private String currency;
    private AccountType type;
}
