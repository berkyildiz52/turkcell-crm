package com.turkcell.pair2.customerservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "contacts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Contact {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  int id;

    @Column(name = "email")
    private String email;


//    @Column(name = "home_phone")
    private Long homePhone;


//    @Column(name = "mobile_phone")
    private Long mobilePhone;

//    @Column(name = "fax")
    private Long fax;

}
