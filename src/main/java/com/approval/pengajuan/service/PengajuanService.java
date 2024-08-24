package com.approval.pengajuan.service;

import com.approval.pengajuan.model.Customer;
import com.approval.pengajuan.model.Pengajuan;
import com.approval.pengajuan.model.Pinjaman;
import com.approval.pengajuan.model.Vehicles;

import java.util.List;

public interface PengajuanService {

    public void createPengajuan(Customer customer, Vehicles vehicles, Pinjaman pinjaman);

    public Pengajuan getPengajuan(String id);

    public List<Pengajuan> getAllPengajuan();

    String generateNoPengajuan();
}
