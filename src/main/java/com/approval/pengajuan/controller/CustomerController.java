package com.approval.pengajuan.controller;

import com.approval.pengajuan.model.Customer;
import com.approval.pengajuan.service.CustomerService;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable("id") String id) {
        return customerService.getCustomer(id);
    }

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping
    public String createCustomer(@RequestBody Customer customer) throws Exception{
        try{
            customerService.createCustomer(customer);
            return "Customer created successfully";
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
