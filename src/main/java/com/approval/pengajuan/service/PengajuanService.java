package com.approval.pengajuan.service;

import com.approval.pengajuan.model.Pengajuan;

import java.util.List;

public interface PengajuanService {

    public void createPengajuan(Pengajuan pengajuan);

    public Pengajuan getPengajuan(String id);

    public List<Pengajuan> getAllPengajuan();

}
