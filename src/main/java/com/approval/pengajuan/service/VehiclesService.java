package com.approval.pengajuan.service;

import com.approval.pengajuan.model.Vehicles;

import java.util.List;

public interface VehiclesService {

    public Vehicles getVehicle(String id);

    List<Vehicles> getVehiclesByPinjaman();

    public List<Vehicles> getAllVehicles();
}
