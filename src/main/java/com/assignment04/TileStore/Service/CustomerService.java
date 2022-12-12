package com.assignment04.TileStore.Service;

import com.assignment04.TileStore.Persistence.Customer.Customer;
import com.assignment04.TileStore.Persistence.Customer.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public List<Customer> getALl() {
        return this.repo.findAll();
    }

    public Customer getById (Long id) {
        return this.repo.findById(id).get();
    }

    public Customer addCustomer (Customer customer) {
        return this.repo.save(customer);
    }

    public Customer updateCustomer (Long id, Customer customer) {
        Optional<Customer> cust = this.repo.findById(id);
        if (cust.isPresent()) {
            cust.get().setF_name(customer.getF_name());
            cust.get().setL_name(customer.getL_name());
            cust.get().setPh_num(customer.getPh_num());
            cust.get().setEmail(customer.getEmail());
            cust.get().setPassword(customer.getPassword());
            return this.repo.save(cust.get());
        }
        throw new RuntimeException();
    }

    public void deleteCustomer (Long id) {
        this.repo.deleteById(id);
    }
}
