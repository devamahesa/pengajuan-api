package com.approval.pengajuan.serviceImpl;

import com.approval.pengajuan.exception.NotFoundException;
import com.approval.pengajuan.model.Customer;
import com.approval.pengajuan.repository.CustomerRepository;
import com.approval.pengajuan.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(Customer customer) {
        Optional<Customer> custNik = customerRepository.findCustomerByNik(customer.getNik());
        if(custNik.isPresent()){
            throw new NotFoundException("NIK has been taken!");
        }
        Timestamp date = Timestamp.from(Instant.now());
        customer.setCreated_at(date);
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(String id, Customer customer) {

    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public void softDeleteUser(String id, Customer customer) {

    }

    @Override
    public Customer getCustomer(String id) {
        if(customerRepository.findById(id).isEmpty()){
            throw new NotFoundException("Customer Tidak Ditemukan");
        }
        else{
            return customerRepository.findById(id).get();
        }
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> getCustomerPagination(int pageNo, int pageSize, String sortBy) {
        return null;
    }
}
