package com.approval.pengajuan.controller;

import com.approval.pengajuan.model.Vehicles;
import com.approval.pengajuan.service.VehiclesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
public class VehiclesController {
    VehiclesService vehiclesService;
    public VehiclesController(VehiclesService vehiclesService){
        this.vehiclesService = vehiclesService;
    }

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
