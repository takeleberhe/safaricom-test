package com.safaricom.BankApplication.repository;

import com.safaricom.BankApplication.entity.tbl_bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bankRepository extends JpaRepository <tbl_bank,Long>{
}
