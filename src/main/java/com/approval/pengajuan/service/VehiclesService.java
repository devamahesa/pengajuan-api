package com.approval.pengajuan.service;

import com.approval.pengajuan.model.Vehicles;

import java.util.List;

public interface VehiclesService {

    public Vehicles getVehicle(String id);

    public List<Vehicles> getAllVehicles();
}
