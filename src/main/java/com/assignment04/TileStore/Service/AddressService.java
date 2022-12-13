package com.assignment04.TileStore.Service;

import com.assignment04.TileStore.Persistence.Address.Address;
import com.assignment04.TileStore.Persistence.Address.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private AddressRepository repo;

    public AddressService(AddressRepository repo) {
        this.repo = repo;
    }

    public List<Address> getAll(){
        return this.repo.findAll();
    }

    public Address getById(Long id) {
        return this.repo.findById(id).get();
    }

    public Address addAddress (Address address) {
        return this.repo.save(address);
    }

    public Address updateAddress (Long id, Address address) {
        Optional<Address> addr = this.repo.findById(id);
        if (addr.isPresent()) {
            addr.get().setP_id(address.getP_id());
            return this.repo.save(addr.get());
        }
        throw new RuntimeException();
    }

    public void deleteAddress (Long id) {
        this.repo.deleteById(id);
    }
}
