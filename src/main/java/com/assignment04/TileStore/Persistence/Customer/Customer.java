package com.assignment04.TileStore.Persistence.Customer;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private String f_name;

    private String l_name;

    private String ph_num;

    private String email;

    private String password;

}
