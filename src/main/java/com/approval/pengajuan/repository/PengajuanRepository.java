package com.approval.pengajuan.repository;

import com.approval.pengajuan.model.Pengajuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PengajuanRepository extends JpaRepository<Pengajuan, String> {

    @Query("select p.noPengajuan from Pengajuan p order by p.idPengajuan desc limit 1")
    String findLatestNoPengajuan();

    Optional<Pengajuan> findPengajuanByNoPengajuan(String no);
}
