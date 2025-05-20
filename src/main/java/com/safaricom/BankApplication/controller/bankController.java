package com.safaricom.BankApplication.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.safaricom.BankApplication.service.bank_Service;
import com.safaricom.BankApplication.dto.bankDto;
import com.safaricom.BankApplication.entity.tbl_bank;
import com.safaricom.BankApplication.mapper.bankMapper;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/banks")
@RequiredArgsConstructor

public class bankController {

    private final bank_Service service;
    private final bankMapper mapper;

    @PostMapping
    public ResponseEntity<bankDto> createbank(bankDto dto){
        return ResponseEntity.ok(service.createBank(dto));

    }

    @GetMapping
    public ResponseEntity<List<bankDto>> getAllBanks(bankDto dto){
        return ResponseEntity.ok(service.getAllbanks());

    }


}
