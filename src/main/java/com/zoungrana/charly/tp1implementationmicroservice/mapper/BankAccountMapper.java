package com.zoungrana.charly.tp1implementationmicroservice.mapper;

import com.zoungrana.charly.tp1implementationmicroservice.dtos.BankAccountRequestDTO;
import com.zoungrana.charly.tp1implementationmicroservice.dtos.BankAccountResponseDTO;
import com.zoungrana.charly.tp1implementationmicroservice.entities.BankAccount;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface BankAccountMapper {
    BankAccount toEntity(BankAccountRequestDTO bankAccountRequestDTO);
    BankAccountResponseDTO toResponseDTO(BankAccount bankAccount);
    void updateEntity(BankAccountRequestDTO bankAccountRequestDTO,@MappingTarget BankAccount bankAccount);
}
