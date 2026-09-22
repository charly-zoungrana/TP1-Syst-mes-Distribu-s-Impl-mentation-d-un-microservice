package com.zoungrana.charly.tp1implementationmicroservice.dtos;

import com.zoungrana.charly.tp1implementationmicroservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * @author Charly Zoungrana
 * @created 22/09/2026
 * @time 13:00
 */

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountRequestDTO {
    private Double balance;
    private String currency;
    private AccountType type;
}
