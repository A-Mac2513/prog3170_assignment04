package com.assignment04.TileStore.Service;

import com.assignment04.TileStore.Persistence.Inventory.Inventory;
import com.assignment04.TileStore.Persistence.Inventory.InventoryRepository;
import com.assignment04.TileStore.Persistence.Tile.Tile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    InventoryRepository repo;

    public InventoryService(InventoryRepository repo) {
        this.repo = repo;
    }

    public List<Inventory> getAll(){
        return this.repo.findAll();
    }

    public Inventory getById(Long id) {
        return this.repo.findById(id).get();
    }

    public Inventory addInventory (Inventory inventory) {
        return this.repo.save(inventory);
    }

    public Inventory updateInventory (Long id, Inventory inventory) {
        Optional<Inventory> inv = this.repo.findById(id);
        if (inv.isPresent()) {
            inv.get().setQty(inventory.getQty());
            return this.repo.save(inv.get());
        }
        throw new RuntimeException();
    }

    public void deleteTile (Long id) {
        this.repo.deleteById(id);
    }
}
