package com.turkcell.pair2.customerservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//@Entity
////@Table(name = "role")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Role {

//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
    private  int id;

//    @Column(name = "name")
    private String name;

}
