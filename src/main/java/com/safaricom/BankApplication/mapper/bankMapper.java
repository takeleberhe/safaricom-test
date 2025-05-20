package com.safaricom.BankApplication.mapper;

import com.safaricom.BankApplication.dto.bankDto;
import com.safaricom.BankApplication.entity.tbl_bank;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel="spring")
public interface bankMapper {
    bankMapper INSTACE= Mappers.getMapper(bankMapper.class);

    bankDto toDto(tbl_bank tbl_bank);
    tbl_bank toEntity(bankDto bankDto);

}
