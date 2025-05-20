package com.safaricom.BankApplication.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.safaricom.BankApplication.dto.branchDto;
import com.safaricom.BankApplication.service.branchService;

import java.util.List;


@RestController
@RequestMapping("/api/banks")
@RequiredArgsConstructor

public class branchController {
    private final branchService service;
   @GetMapping("/{id}")
  public ResponseEntity<List<branchDto>> getBranchById(Long id){
          return ResponseEntity.ok(service.getBranchesByBankId(id));

  }


}
