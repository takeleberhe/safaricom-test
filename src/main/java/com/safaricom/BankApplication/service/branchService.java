package com.safaricom.BankApplication.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.safaricom.BankApplication.repository.branchRepository;
import com.safaricom.BankApplication.mapper.branchMapper;
import com.safaricom.BankApplication.dto.branchDto;
import com.safaricom.BankApplication.entity.tbl_branch;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class branchService {
    private final branchRepository repository;
    private final branchMapper mapper;

    public branchDto createBankBranch(branchDto dto){

        tbl_branch branch=mapper.toEntity(dto);
        tbl_branch saved=repository.save(branch);
        return  mapper.toDto(saved);
      }

    public List<branchDto> getBranchesByBankId(Long id){

        return repository.findById(id).stream().map(mapper::toDto).collect(Collectors.toList());
    }

}
