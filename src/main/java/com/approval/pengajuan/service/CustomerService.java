package com.approval.pengajuan.service;

import com.approval.pengajuan.model.Customer;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CustomerService {

    public void createCustomer(Customer customer);

    public void updateCustomer(String id, Customer customer);

    public void deleteUser(String id);

    public void softDeleteUser(String id, Customer customer);

    public Customer getCustomer(String id);

    public List<Customer> getAllCustomer();

    Page<Customer> getCustomerPagination(int pageNo, int pageSize, String sortBy);
}
