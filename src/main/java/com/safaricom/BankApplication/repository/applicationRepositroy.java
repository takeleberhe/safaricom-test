package com.safaricom.BankApplication.repository;

import com.safaricom.BankApplication.entity.tbl_application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface applicationRepositroy extends JpaRepository <tbl_application,Long> {
}
