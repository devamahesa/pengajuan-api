package com.approval.pengajuan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trx_pengajuan")
public class Pengajuan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pengajuan")
    private Integer idPengajuan;

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
}
