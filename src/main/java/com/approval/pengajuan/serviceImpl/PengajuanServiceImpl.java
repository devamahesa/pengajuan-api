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

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Service
public class PengajuanServiceImpl implements PengajuanService {

    private static final Integer NUMBER_LENGTH = 3;

    @Autowired
    PengajuanRepository pengajuanRepository;
    public PengajuanServiceImpl(
            PengajuanRepository pengajuanRepository){
        this.pengajuanRepository = pengajuanRepository;
    }

    @Override
    public void createPengajuan(Customer customer, Vehicles vehicles, Pinjaman pinjaman) {
        Pengajuan pengajuan = new Pengajuan();
        String noPengajuan = generateNoPengajuan();
        Timestamp date = Timestamp.from(Instant.now());
        if(pengajuanRepository.findPengajuanByNoPengajuan(noPengajuan).isPresent()){
            throw new NotFoundException("Nomor Pengajuan sudah ada");
        }
        else{
            pengajuan.setCustomer(customer);
            pengajuan.setVehicles(vehicles);
            pengajuan.setPinjaman(pinjaman);
            pengajuan.setStatus("PENGAJUAN");
            pengajuan.setNoPengajuan(noPengajuan);
            pengajuan.setCreated_at(date);
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

    @Override
    public String generateNoPengajuan(){
        String noPengajuan = pengajuanRepository.findLatestNoPengajuan();
        int latestNum = Integer.parseInt(noPengajuan.split("/")[2]);
        String newNumber = String.format("%0" + NUMBER_LENGTH + "d", latestNum + 1);
        return String.format("CRE/CUST/%s", newNumber);
    }

    @Override
    public Pengajuan setStatus(String id, String status){
        Timestamp updatedDate = Timestamp.from(Instant.now());
        boolean isPengajuan = Objects.equals(pengajuanRepository.getReferenceById(id).getStatus(), "PENGAJUAN");
        if(pengajuanRepository.findById(id).isPresent() && isPengajuan){
            Pengajuan pengajuan = pengajuanRepository.findById(id).get();
            pengajuan.setStatus(status);
            pengajuan.setUpdated_at(updatedDate);
            pengajuanRepository.save(pengajuan);
            return pengajuan;
        }
        else if (!isPengajuan) {
            throw new NotFoundException("Status tidak dapat diubah");
        } else{
            throw new NotFoundException("Data pengajuan tidak ditemukan");
        }

    }
}
