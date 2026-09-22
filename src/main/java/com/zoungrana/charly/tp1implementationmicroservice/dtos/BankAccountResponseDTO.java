package com.zoungrana.charly.tp1implementationmicroservice.dtos;

import com.zoungrana.charly.tp1implementationmicroservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

/**
 * @author Charly Zoungrana
 * @created 22/09/2026
 * @time 13:00
 */

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountResponseDTO {
    private UUID id;
    private LocalDate createdAt;
    private Double balance;
    private String currency;
    private AccountType type;
}
