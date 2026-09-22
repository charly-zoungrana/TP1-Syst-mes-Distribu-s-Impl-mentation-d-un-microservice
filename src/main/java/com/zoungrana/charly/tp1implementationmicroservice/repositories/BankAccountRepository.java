package com.zoungrana.charly.tp1implementationmicroservice.repositories;

import com.zoungrana.charly.tp1implementationmicroservice.entities.BankAccount;
import com.zoungrana.charly.tp1implementationmicroservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.UUID;

/**
 * @author Charly Zoungrana
 * @created 22/09/2026
 * @time 00:18
 */
@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, UUID> {

    @RestResource(path="/byType")
    List<BankAccount> findByType(@Param("t") AccountType type);
}

