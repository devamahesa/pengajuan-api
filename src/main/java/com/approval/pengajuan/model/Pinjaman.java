package com.approval.pengajuan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "id_kendaraan")
    private Integer idKendaraan;
}
