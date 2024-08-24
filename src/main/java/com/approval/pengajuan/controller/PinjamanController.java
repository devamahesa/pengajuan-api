package com.approval.pengajuan.controller;

import com.approval.pengajuan.model.Pinjaman;
import com.approval.pengajuan.service.PinjamanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pinjaman")
public class PinjamanController {

    @Autowired
    PinjamanService pinjamanService;

    @GetMapping("{id}")
    public Pinjaman getPinjaman(@PathVariable("id") String id) {
        return pinjamanService.getPinjaman(id);
    }

    @GetMapping
    public List<Pinjaman> getAllPinjaman(){
        return pinjamanService.getAllPinjaman();
    }

    @GetMapping("/vehicle/{id}")
    public List<Pinjaman> getPinjamanByVehicles(@PathVariable("id") String id){
        return pinjamanService.getPinjamanByIdKendaraan(id);
    }
}
