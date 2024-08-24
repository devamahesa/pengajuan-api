package com.approval.pengajuan.serviceImpl;
import com.approval.pengajuan.exception.NotFoundException;
import com.approval.pengajuan.model.Customer;
import com.approval.pengajuan.model.Pinjaman;
import com.approval.pengajuan.model.Vehicles;
import com.approval.pengajuan.model.Pengajuan;
import com.approval.pengajuan.repository.PengajuanRepository;
import com.approval.pengajuan.service.PengajuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PengajuanServiceImpl implements PengajuanService {

    @Autowired
    PengajuanRepository pengajuanRepository;
    public PengajuanServiceImpl(
            PengajuanRepository pengajuanRepository){
        this.pengajuanRepository = pengajuanRepository;
    }

    @Override
    public void createPengajuan(String noPengajuan, Customer customer, Vehicles vehicles, Pinjaman pinjaman) {
        Pengajuan pengajuan = new Pengajuan();
        if(pengajuanRepository.findPengajuanByNoPengajuan(noPengajuan).isPresent()){
            throw new NotFoundException("Nomor Pengajuan sudah ada");
        }
        else{
            pengajuan.setCustomer(customer);
            pengajuan.setVehicles(vehicles);
            pengajuan.setPinjaman(pinjaman);
            pengajuan.setNoPengajuan(noPengajuan);
            pengajuanRepository.save(pengajuan);
        }
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
