package com.approval.pengajuan.controller;

import com.approval.pengajuan.model.Pengajuan;
import com.approval.pengajuan.service.PengajuanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pengajuan")
public class PengajuanController {

    PengajuanService pengajuanService;

    public PengajuanController(PengajuanService pengajuanService) {
        this.pengajuanService = pengajuanService;
    }

    @GetMapping
    public List<Pengajuan> getAllPengajuan(){
        return pengajuanService.getAllPengajuan();
    }

    @PostMapping
    public String createPengajuan(@RequestBody Pengajuan pengajuan) throws Exception{
        try{
            pengajuanService.createPengajuan(pengajuan);
            return "Pengajuan berhasil dibuat";
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
