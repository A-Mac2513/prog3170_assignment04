package com.assignment04.TileStore.Persistence.Customer;

import com.assignment04.TileStore.Persistence.Address.Address;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

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

    /*@OneToMany(fetch = FetchType.EAGER,mappedBy="a_id",cascade = CascadeType.ALL)
    private Set<Address> addressSet;*/

}
