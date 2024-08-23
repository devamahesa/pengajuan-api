package com.approval.pengajuan.service;

import com.approval.pengajuan.model.Pinjaman;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface PinjamanService {

    public void createPinjaman(Pinjaman pinjaman);

    public void updatePinjaman(String id, Pinjaman pinjaman);

    public void deletePinjaman(String id);

    public void softDeletePinjaman(String id, Pinjaman pinjaman);

    public Pinjaman  getPinjaman(String id);

    public List<Pinjaman> getAllPinjaman();

    List<Pinjaman> getPinjamanByIdKendaraan(String idKendaraan);

    Page<Pinjaman> getPinjamanPagination(int pageNo, int pageSize, String sortBy);
}
