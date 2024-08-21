package com.approval.pengajuan.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

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

    public Integer getId_cust() {
        return id_cust;
    }

    public void setId_cust(Integer id_cust) {
        this.id_cust = id_cust;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getKtpFilename() {
        return ktpFilename;
    }

    public void setKtpFilename(String ktpFilename) {
        this.ktpFilename = ktpFilename;
    }

    public String getKkFilename() {
        return kkFilename;
    }

    public void setKkFilename(String kkFilename) {
        this.kkFilename = kkFilename;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Timestamp getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Timestamp deleted_at) {
        this.deleted_at = deleted_at;
    }

    public Customer() {
    }

    public Customer(Integer id_cust, String custName, String nik, String birthDate, String maritalStatus, String ktpFilename, String kkFilename, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at) {
        this.id_cust = id_cust;
        this.custName = custName;
        this.nik = nik;
        this.birthDate = birthDate;
        this.maritalStatus = maritalStatus;
        this.ktpFilename = ktpFilename;
        this.kkFilename = kkFilename;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
    }
}
