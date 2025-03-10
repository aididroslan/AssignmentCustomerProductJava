package aidid.customer.product.service;

import aidid.customer.product.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);
}