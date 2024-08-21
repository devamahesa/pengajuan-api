package com.approval.pengajuan.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "m_kendaraan")
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kendaraan")
    private Integer id_kendaraan;

    @Column(name = "dealer")
    private String dealer;

    @Column(name = "merk")
    private String merk;

    @Column(name = "model")
    private String model;

    @Column(name = "type")
    private String type;

    @Column(name = "warna")
    private String warna;

    @Column(name = "harga")
    private BigDecimal harga;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Timestamp created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Timestamp updated_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted_at")
    private Timestamp deleted_at;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_kendaraan")
    private List<Pinjaman> pinjaman;

    public Vehicles() {

    }


    public Integer getId_kendaraan() {
        return id_kendaraan;
    }

    public void setId_kendaraan(Integer id_kendaraan) {
        this.id_kendaraan = id_kendaraan;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
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

    public List<Pinjaman> getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(List<Pinjaman> pinjaman) {
        this.pinjaman = pinjaman;
    }


    public Vehicles(Integer id_kendaraan, String dealer, String merk, String model, String type, String warna, BigDecimal harga, Timestamp created_at, Timestamp updated_at, Timestamp deleted_at, List<Pinjaman> pinjaman) {
        this.id_kendaraan = id_kendaraan;
        this.dealer = dealer;
        this.merk = merk;
        this.model = model;
        this.type = type;
        this.warna = warna;
        this.harga = harga;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
        this.pinjaman = pinjaman;
    }
}
