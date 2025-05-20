package com.safaricom.BankApplication.service;

import com.safaricom.BankApplication.repository.bankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.safaricom.BankApplication.mapper.bankMapper;
import com.safaricom.BankApplication.dto.bankDto;
import com.safaricom.BankApplication.entity.tbl_bank;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service

public class bank_Service {
    private final bankRepository repository;
    private final bankMapper bankMapper;

  public bankDto createBank(bankDto dto){
         // to entity
      tbl_bank bank=bankMapper.toEntity(dto);
      tbl_bank saved=repository.save(bank);

      return bankMapper.toDto(saved);
  }

  public List<bankDto> getAllbanks(){
      return repository.findAll().stream().map(bankMapper::toDto).collect(Collectors.toList());
  }

}
