package com.zoungrana.charly.tp1implementationmicroservice.entities;

import com.zoungrana.charly.tp1implementationmicroservice.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author Charly Zoungrana
 * @created 22/09/2026
 * @time 12:48
 */
@Projection(types=BankAccount.class,name="p1")
public interface AccountProjection {
    public String getId();
    public AccountType getType();
    public Double getBalance();
}
