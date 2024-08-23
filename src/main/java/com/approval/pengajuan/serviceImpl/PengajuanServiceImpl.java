package com.approval.pengajuan.serviceImpl;

import com.approval.pengajuan.exception.NotFoundException;
import com.approval.pengajuan.model.Pengajuan;
import com.approval.pengajuan.repository.PengajuanRepository;
import com.approval.pengajuan.service.PengajuanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PengajuanServiceImpl implements PengajuanService {

    PengajuanRepository pengajuanRepository;

    public PengajuanServiceImpl(PengajuanRepository pengajuanRepository){
        this.pengajuanRepository = pengajuanRepository;
    }

    @Override
    public void createPengajuan(Pengajuan pengajuan) {
        pengajuanRepository.save(pengajuan);
    }

    @Override
    public Pengajuan getPengajuan(String id) {
        if(pengajuanRepository.findById(id).isPresent()){
            return pengajuanRepository.findById(id).get();
        }
        else {
            throw new NotFoundException("Customer Tidak Ditemukan");
        }
    }

    @Override
    public List<Pengajuan> getAllPengajuan() {
        return pengajuanRepository.findAll();
    }
}
