package com.approval.pengajuan.model;

import jakarta.persistence.*;
import org.springframework.data.relational.core.sql.In;

import java.math.BigDecimal;

@Entity
@Table(name = "m_pinjaman")
public class Pinjaman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pinjaman")
    private Integer id_pinjaman;

    @Column(name = "asuransi")
    private String asuransi;

    @Column(name = "down_payment")
    private BigDecimal downPayment;

    @Column(name = "lama_kredit")
    private Integer lamaKredit;

    @Column(name = "angsuran")
    private BigDecimal angsuran;

    /*
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_kendaraan", referencedColumnName = "id_kendaraan")
    private Vehicles vehicles; */

    @Column(name = "id_kendaraan")
    private Integer id_kendaraan;

    public Integer getId_pinjaman() {
        return id_pinjaman;
    }

    public void setId_pinjaman(Integer id_pinjaman) {
        this.id_pinjaman = id_pinjaman;
    }

    public String getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(String asuransi) {
        this.asuransi = asuransi;
    }

    public BigDecimal getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(BigDecimal downPayment) {
        this.downPayment = downPayment;
    }

    public Integer getLamaKredit() {
        return lamaKredit;
    }

    public void setLamaKredit(Integer lamaKredit) {
        this.lamaKredit = lamaKredit;
    }

    public BigDecimal getAngsuran() {
        return angsuran;
    }

    public void setAngsuran(BigDecimal angsuran) {
        this.angsuran = angsuran;
    }

    public Integer getIdKendaraan(){
        return id_kendaraan;
    }

    public void setIdKendaraan(Integer id_kendaraan) {
        this.id_kendaraan = id_kendaraan;
    }

    /*
    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    } */

    public Pinjaman() {
    }

    public Pinjaman(Integer id_pinjaman, String asuransi, BigDecimal downPayment, Integer lamaKredit, BigDecimal angsuran, Integer id_kendaraan) {
        this.id_pinjaman = id_pinjaman;
        this.asuransi = asuransi;
        this.downPayment = downPayment;
        this.lamaKredit = lamaKredit;
        this.angsuran = angsuran;
        //this.vehicles = vehicles;
        this.id_kendaraan = id_kendaraan;
    }
}
