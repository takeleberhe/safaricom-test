package com.safaricom.BankApplication.entity;

 import jakarta.persistence.*;
 import lombok.AllArgsConstructor;
 import lombok.Builder;
 import lombok.NoArgsConstructor;

 import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class tbl_branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String value;
    @OneToMany
    @JoinColumn(name = "bank_id")
    private tbl_bank tbl_bank;

}
