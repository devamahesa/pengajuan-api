package com.approval.pengajuan.repository;

import com.approval.pengajuan.model.Pengajuan;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PengajuanRepository extends JpaRepository<Pengajuan, String> {
    Optional<Pengajuan> findPengajuanByNoPengajuan(String no);
}
