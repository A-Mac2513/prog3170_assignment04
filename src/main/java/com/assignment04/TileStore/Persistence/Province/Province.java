package com.assignment04.TileStore.Persistence.Province;

import com.assignment04.TileStore.Persistence.Address.Address;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long p_id;

    private String p_name;

   /* @OneToMany(fetch = FetchType.EAGER,mappedBy="a_id",cascade = CascadeType.ALL)
    private Set<Address> addressSet;*/
}
