package com.safaricom.BankApplication.repository;

import com.safaricom.BankApplication.entity.tbl_transacion_history;
import org.springframework.data.jpa.repository.JpaRepository;

public interface transactionRepository extends JpaRepository<tbl_transacion_history,Long> {
}
