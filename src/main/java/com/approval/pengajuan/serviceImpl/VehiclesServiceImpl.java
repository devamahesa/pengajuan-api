package com.approval.pengajuan.serviceImpl;

import com.approval.pengajuan.exception.NotFoundException;
import com.approval.pengajuan.model.Vehicles;
import com.approval.pengajuan.repository.VehiclesRepository;
import com.approval.pengajuan.service.VehiclesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclesServiceImpl implements VehiclesService {

    VehiclesRepository vehiclesRepository;

    public VehiclesServiceImpl(VehiclesRepository vehiclesRepository){
        this.vehiclesRepository = vehiclesRepository;
    }

    @Override
    public Vehicles getVehicle(String id) {
        if(vehiclesRepository.findById(id).isEmpty()){
            throw new NotFoundException("Kendaraan tidak ditemukan!");
        }
        else{
            return vehiclesRepository.findById(id).get();
        }
    }

    @Override
    public List<Vehicles> getAllVehicles() {
        return vehiclesRepository.findAll();
    }
}
