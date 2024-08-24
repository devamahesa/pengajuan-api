package com.approval.pengajuan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "m_customer")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cust")
    private Integer id_cust;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "nik")
    private String nik;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "ktp_filename")
    private String ktpFilename;

    @Column(name = "kk_filename")
    private String kkFilename;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Timestamp created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Timestamp updated_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted_at")
    private Timestamp deleted_at;
}
