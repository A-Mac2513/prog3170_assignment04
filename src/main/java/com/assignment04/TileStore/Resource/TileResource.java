package com.assignment04.TileStore.Resource;

import com.assignment04.TileStore.Persistence.Tile.Tile;
import com.assignment04.TileStore.Service.TileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TileResource {
    TileService service;

    public TileResource(TileService service) {
        this.service = service;
    }

    @GetMapping(value = "/tiles")
    public List<Tile> getAll() {
        return service.getAll();
    }

    @GetMapping(value = "/tiles/{id}")
    public Tile getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping(value = "/tiles")
    public Tile addTile(Tile tile) {
        return service.addTile(tile);
    }

    @PutMapping(value = "/tiles/{id}", consumes = "application/json")
    public Tile updateTile(@PathVariable Long id, @RequestBody Tile tile) {
        return service.updateTile(id, tile);
    }

    @DeleteMapping(value = "/tiles/{id}")
    public void deleteTile(@PathVariable Long id) {
        service.deleteTile(id);
    }
}
