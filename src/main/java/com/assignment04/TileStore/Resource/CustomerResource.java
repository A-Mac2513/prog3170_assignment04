package com.assignment04.TileStore.Resource;

import com.assignment04.TileStore.Persistence.Customer.Customer;
import com.assignment04.TileStore.Service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerResource {
    CustomerService service;

    public CustomerResource(CustomerService service) {
        this.service = service;
    }

    @GetMapping(value = "/Customers")
    public List<Customer> getALl() {
        return service.getALl();
    }

    @GetMapping(value = "/Customers/{id}")
    public Customer getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping(value = "/Customers")
    public Customer addCustomer(Customer customer) {
        return service.addCustomer(customer);
    }

    @PutMapping(value = "/Customers/{id}", consumes = "application/json")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return service.updateCustomer(id, customer);
    }

    @DeleteMapping(value = "/Customers/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        service.deleteCustomer(id);
    }
}
