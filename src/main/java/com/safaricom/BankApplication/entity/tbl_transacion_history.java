package com.safaricom.BankApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class tbl_transacion_history {
       @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long Id;
       private String value;
       private String transaction_ID;
       Status Enum;
       LocalDateTime TimeStamp;

}
