package com.approval.pengajuan.repository;

import com.approval.pengajuan.model.Pinjaman;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PinjamanRepository extends JpaRepository<Pinjaman, String> {
    List<Pinjaman> findPinjamanByIdKendaraan(Integer idKendaraan);
}
