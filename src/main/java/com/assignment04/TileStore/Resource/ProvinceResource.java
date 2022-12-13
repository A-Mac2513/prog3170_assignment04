package com.assignment04.TileStore.Resource;

import com.assignment04.TileStore.Persistence.Province.Province;
import com.assignment04.TileStore.Service.ProvinceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProvinceResource {
    private ProvinceService service;

    public ProvinceResource(ProvinceService service) {
        this.service = service;
    }

    @GetMapping(value = "/provinces")
    public List<Province> getAll() {
        return service.getAll();
    }

    @GetMapping(value = "/provinces/{id}")
    public Province getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping(value = "/provinces")
    public Province addProvince(Province province) {
        return service.addProvince(province);
    }

    @PutMapping(value = "/provinces/{id}")
    public Province updateProvince(@PathVariable Long id, @RequestBody Province province) {
        return service.updateProvince(id, province);
    }

    @DeleteMapping(value = "/provinces/{id}")
    public void deleteProvince(@PathVariable Long id) {
        service.deleteProvince(id);
    }
}
