package com.approval.pengajuan.controller;
import com.approval.pengajuan.model.Customer;
import com.approval.pengajuan.model.Pengajuan;
import com.approval.pengajuan.model.Pinjaman;
import com.approval.pengajuan.model.Vehicles;
import com.approval.pengajuan.service.CustomerService;
import com.approval.pengajuan.service.PengajuanService;
import com.approval.pengajuan.service.PinjamanService;
import com.approval.pengajuan.service.VehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pengajuan")
public class PengajuanController {

    @Autowired
    PengajuanService pengajuanService;
    @Autowired
    CustomerService customerService;
    @Autowired
    PinjamanService pinjamanService;
    @Autowired
    VehiclesService vehiclesService;


    @GetMapping("nextGeneratedNum")
    public String getNextGeneratedNum(){
        return pengajuanService.generateNoPengajuan();
    }

    @GetMapping
    public List<Pengajuan> getAllPengajuan(){
        return pengajuanService.getAllPengajuan();
    }

    @PostMapping
    public String createPengajuan(
            @RequestParam(name = "idCustomer") String idCustomer,
            @RequestParam(name = "idKendaraan") String idKendaraan,
            @RequestParam(name = "idPinjaman") String idPinjaman
    ) throws Exception{
        try{
            Customer customer = customerService.getCustomer(idCustomer);
            Vehicles vehicle = vehiclesService.getVehicle(idKendaraan);
            Pinjaman pinjaman = pinjamanService.getPinjaman(idPinjaman);
            pengajuanService.createPengajuan(customer, vehicle, pinjaman);
            return "Pengajuan berhasil dibuat";
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @PutMapping("approval/{id}")
    public Pengajuan setStatusPengajuan(
            @PathVariable(name = "id") String idPengajuan,
            @RequestParam(name = "status") String status
    ) throws Exception{
        try{
            return pengajuanService.setStatus(idPengajuan, status);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
