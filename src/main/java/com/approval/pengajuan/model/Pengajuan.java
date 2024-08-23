package com.approval.pengajuan.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "trx_pengajuan")
public class Pengajuan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pengajuan")
    private Integer id_pengajuan;

    @Column(name = "no_pengajuan")
    private String noPengajuan;

    @Column(name = "bukti_bayar_filename")
    private String buktiBayarFilename;

    @Column(name = "form_pengajuan_filename")
    private String formPengajuanFilename;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Timestamp created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Timestamp updated_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted_at")
    private Timestamp deleted_at;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_customer")
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pinjaman")
    private Pinjaman pinjaman;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_kendaraan")
    private Vehicles vehicles;

    public Integer getId_pengajuan() {
        return id_pengajuan;
    }

    public void setId_pengajuan(Integer id_pengajuan) {
        this.id_pengajuan = id_pengajuan;
    }

    public String getNoPengajuan() {
        return noPengajuan;
    }

    public void setNoPengajuan(String noPengajuan) {
        this.noPengajuan = noPengajuan;
    }

    public String getBuktiBayarFilename() {
        return buktiBayarFilename;
    }

    public void setBuktiBayarFilename(String buktiBayarFilename) {
        this.buktiBayarFilename = buktiBayarFilename;
    }

    public String getFormPengajuanFilename() {
        return formPengajuanFilename;
    }

    public void setFormPengajuanFilename(String formPengajuanFilename) {
        this.formPengajuanFilename = formPengajuanFilename;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Pinjaman getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(Pinjaman pinjaman) {
        this.pinjaman = pinjaman;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public Pengajuan(){

    }

    public Pengajuan(Integer id_pengajuan, String noPengajuan, String buktiBayarFilename, String formPengajuanFilename, String status, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at, Customer customer, Pinjaman pinjaman, Vehicles vehicles) {
        this.id_pengajuan = id_pengajuan;
        this.noPengajuan = noPengajuan;
        this.buktiBayarFilename = buktiBayarFilename;
        this.formPengajuanFilename = formPengajuanFilename;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
        this.customer = customer;
        this.pinjaman = pinjaman;
        this.vehicles = vehicles;
    }
}
