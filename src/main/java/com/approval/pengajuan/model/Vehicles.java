package com.approval.pengajuan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

}
