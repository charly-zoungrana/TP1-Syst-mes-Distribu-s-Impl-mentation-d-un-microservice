package com.zoungrana.charly.tp1implementationmicroservice;

import com.zoungrana.charly.tp1implementationmicroservice.entities.BankAccount;
import com.zoungrana.charly.tp1implementationmicroservice.entities.Customer;
import com.zoungrana.charly.tp1implementationmicroservice.enums.AccountType;
import com.zoungrana.charly.tp1implementationmicroservice.repositories.BankAccountRepository;
import com.zoungrana.charly.tp1implementationmicroservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.stream.Stream;


@SpringBootApplication
public class Tp1ImplementationMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp1ImplementationMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository, CustomerRepository customerRepository){
        return args -> {

            Stream.of("Charly","Linus","Adams").forEach(c->{
                Customer customer=Customer.builder()
                        .name(c)
                        .build();
                customerRepository.save(customer);
            });

            customerRepository.findAll().forEach(customer -> {
                for(int i=0;i<10;i++){
                    BankAccount bankAccount=BankAccount.builder()
                            .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
                            .balance(10000+Math.random()*80000)
                            .createdAt(LocalDate.now())
                            .currency("MAD")
                            .customer(customer)
                            .build();
                    bankAccountRepository.save(bankAccount);
                }
            });

        };
    }

}
