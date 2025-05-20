package com.safaricom.BankApplication.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.safaricom.BankApplication.dto.branchDto;
import com.safaricom.BankApplication.entity.tbl_branch;
@Mapper(componentModel="spring")

public interface branchMapper {
    branchMapper INSTACE= Mappers.getMapper(branchMapper.class);

    branchDto toDto(tbl_branch tbl_branch);
    tbl_branch toEntity(branchDto branchDto);

}
