package com.assignment04.TileStore.Persistence.Tile;

import com.assignment04.TileStore.Persistence.Tile.Tile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TileRepository extends JpaRepository<Tile, Long> {
}
