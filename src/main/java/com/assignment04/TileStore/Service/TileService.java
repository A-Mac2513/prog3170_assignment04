package com.assignment04.TileStore.Service;

import com.assignment04.TileStore.Persistence.Tile.Tile;
import com.assignment04.TileStore.Persistence.Tile.TileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TileService {
    TileRepository repo;

    public TileService(TileRepository repo) {
        this.repo = repo;
    }

    public List<Tile> getAll(){
        return this.repo.findAll();
    }

    public Tile getById(Long id) {
        return this.repo.findById(id).get();
    }

    public Tile addTile (Tile tile) {
        return this.repo.save(tile);
    }

    public Tile updateTile (Long id, Tile tile) {
        Optional<Tile> theTile = this.repo.findById(id);
        if (theTile.isPresent()) {
            theTile.get().setT_name(tile.getT_name());
            theTile.get().setT_description(tile.getT_description());
            theTile.get().setT_price(tile.getT_price());
            return this.repo.save(theTile.get());
        }
        throw new RuntimeException();
    }

    public void deleteTile (Long id) {
        this.repo.deleteById(id);
    }
}
