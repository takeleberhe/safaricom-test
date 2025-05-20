package com.safaricom.BankApplication.repository;

import com.safaricom.BankApplication.entity.tbl_branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface branchRepository extends JpaRepository<tbl_branch, Long> {
}
