package com.assignment04.TileStore.Persistence.Address;

import com.assignment04.TileStore.Persistence.Customer.Customer;
import com.assignment04.TileStore.Persistence.Province.Province;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long a_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "c_id", referencedColumnName = "c_id")
    private Customer c_id;

    private String street;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "p_id", referencedColumnName = "p_id")
    private Province p_id;

    private String country;

    private String postal_code;
}
