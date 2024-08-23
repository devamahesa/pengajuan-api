package com.approval.pengajuan.serviceImpl;

import com.approval.pengajuan.model.Pinjaman;
import com.approval.pengajuan.repository.PinjamanRepository;
import com.approval.pengajuan.service.PinjamanService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PinjamanServiceImpl implements PinjamanService {

    PinjamanRepository pinjamanRepository;
    public PinjamanServiceImpl(PinjamanRepository pinjamanRepository){
        this.pinjamanRepository = pinjamanRepository;
    }

    @Override
    public void createPinjaman(Pinjaman pinjaman) {

    }

    @Override
    public void updatePinjaman(String id, Pinjaman pinjaman) {

    }

    @Override
    public void deletePinjaman(String id) {

    }

    @Override
    public void softDeletePinjaman(String id, Pinjaman pinjaman) {

    }

    @Override
    public Pinjaman getPinjaman(String id) {
        return null;
    }

    @Override
    public List<Pinjaman> getAllPinjaman() {
        return pinjamanRepository.findAll();
    }

    @Override
    public List<Pinjaman> getPinjamanByIdKendaraan(String id_kendaraan){
        return pinjamanRepository.findPinjamanByIdKendaraan(Integer.valueOf(id_kendaraan));
    }

    @Override
    public Page<Pinjaman> getPinjamanPagination(int pageNo, int pageSize, String sortBy) {
        return null;
    }
}
