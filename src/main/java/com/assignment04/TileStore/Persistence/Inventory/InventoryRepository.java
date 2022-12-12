package com.assignment04.TileStore.Persistence.Inventory;

import com.assignment04.TileStore.Persistence.Inventory.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
