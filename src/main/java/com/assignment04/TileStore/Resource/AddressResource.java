package com.assignment04.TileStore.Resource;

import com.assignment04.TileStore.Persistence.Address.Address;
import com.assignment04.TileStore.Service.AddressService;
import com.assignment04.TileStore.Service.CustomerService;
import com.assignment04.TileStore.Service.ProvinceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressResource {

    private AddressService addrService;
    private CustomerService custService;
    private ProvinceService provSerice;

    public AddressResource(AddressService addrService) {
        this.addrService = addrService;
    }

    @GetMapping(value = "/addresses")
    public List<Address> getAll() {
        return addrService.getAll();
    }

    @GetMapping(value = "/addresses/{id}")
    public Address getById(@PathVariable Long id) {
        return addrService.getById(id);
    }

    @PostMapping(value = "/addresses")
    public Address addAddress(Address address) {
        address.setP_id(provSerice.getById(address.getP_id().getP_id()));
        address.setC_id(custService.getById(address.getC_id().getC_id()));
        return addrService.addAddress(address);
    }

    @PutMapping(value = "/addresses/{id}")
    public Address updateAddress (@PathVariable Long id, @RequestBody Address address) {
        return addrService.updateAddress(id, address);
    }

    @DeleteMapping(value = "/addresses/{id}")
    public void deleteAddress(@PathVariable Long id) {
        addrService.deleteAddress(id);
    }
}
