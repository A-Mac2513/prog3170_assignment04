package com.assignment04.TileStore.Service;

import com.assignment04.TileStore.Persistence.Province.Province;
import com.assignment04.TileStore.Persistence.Province.ProvinceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService {
    ProvinceRepository repo;

    public ProvinceService(ProvinceRepository repo) {
        this.repo = repo;
    }

    public List<Province> getAll(){
        return this.repo.findAll();
    }

    public Province getById(Long id) {
        return this.repo.findById(id).get();
    }

    public Province addProvince (Province province) {
        return this.repo.save(province);
    }

    public Province updateProvince (Long id, Province province) {
        Optional<Province> prov = this.repo.findById(id);
        if (prov.isPresent()) {
            prov.get().setP_id(province.getP_id());
            return this.repo.save(prov.get());
        }
        throw new RuntimeException();
    }

    public void deleteProvince (Long id) {
        this.repo.deleteById(id);
    }
}
