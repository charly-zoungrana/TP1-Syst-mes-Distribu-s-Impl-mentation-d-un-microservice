package com.zoungrana.charly.tp1implementationmicroservice.entities;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
/**
 * @author Charly Zoungrana
 * @created 22/09/2026
 * @time 23:43
 */
@Entity
@NoArgsConstructor @AllArgsConstructor @Data @Builder
public class Customer {
    @Id @GeneratedValue(strategy= GenerationType.UUID)
    private UUID id;
    private String name;
    @OneToMany(mappedBy = "customer")
    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    private List<BankAccount> bankAccounts;
}
