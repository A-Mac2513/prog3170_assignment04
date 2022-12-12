package com.assignment04.TileStore.Resource;

import com.assignment04.TileStore.Persistence.Inventory.Inventory;
import com.assignment04.TileStore.Service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryResource {
    InventoryService service;

    public InventoryResource(InventoryService service) {
        this.service = service;
    }

    @GetMapping(value = "/inventory")
    public List<Inventory> getAll() {
        return service.getAll();
    }

    @GetMapping(value = "/inventory/{id}")
    public Inventory getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping(value = "/inventory")
    public Inventory addInventory(Inventory inventory) {
        return service.addInventory(inventory);
    }

    @PutMapping(value = "/inventory/{id}")
    public Inventory updateInventory(@PathVariable Long id, @RequestBody Inventory inventory) {
        return service.updateInventory(id, inventory);
    }

    @DeleteMapping(value = "/inventory/{id}")
    public void deleteTile(@PathVariable Long id) {
        service.deleteTile(id);
    }
}
