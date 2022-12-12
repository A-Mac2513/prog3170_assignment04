package com.assignment04.TileStore.Persistence.Tile;

import com.assignment04.TileStore.Persistence.Inventory.Inventory;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Tile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long t_id;

    private String t_name;

    private String t_description;

    private double t_price;

   /* @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "t_id", referencedColumnName = "t_id")
    //private //Inventory //inventory;*/
}
