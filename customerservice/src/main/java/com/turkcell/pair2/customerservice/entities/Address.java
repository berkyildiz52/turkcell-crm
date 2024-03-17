package com.turkcell.pair2.customerservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//@Entity
//@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Address {

//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
    private  int id;

//    @ManyToOne()
//    @JoinColumn(name = "customerid")
    private  Customer  customer;

//    @ManyToOne()
//    @JoinColumn(name = "cityid")
    private  City cityid;


    //    @Column(name = "street")
    private String street;

//    @Column(name = "description")
    private String description;

//    @Column(name = "housenumber")
    private  int housenumber;

}
