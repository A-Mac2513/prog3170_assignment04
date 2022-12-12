package com.assignment04.TileStore.Persistence.Inventory;

import com.assignment04.TileStore.Persistence.Tile.Tile;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long inv_id;

    private long t_id;

    /*@OneToOne(mappedBy = "inventory")
    private Tile tile;*/

    private int qty;
}
