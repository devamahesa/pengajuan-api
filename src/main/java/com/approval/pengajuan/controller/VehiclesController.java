package com.approval.pengajuan.controller;

import com.approval.pengajuan.model.Vehicles;
import com.approval.pengajuan.service.VehiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehiclesController {

    @Autowired
    VehiclesService vehiclesService;
    @GetMapping
    public List<Vehicles> getAllVehicles(){
        return vehiclesService.getAllVehicles();
    }

    @GetMapping("{id}")
    public Vehicles getVehicles(@PathVariable("id") String id){
        return vehiclesService.getVehicle(id);
    }

    @GetMapping("/pinjaman")
    public List<Vehicles> getVehiclesPinjaman(){
        return vehiclesService.getVehiclesByPinjaman();
    }
}
