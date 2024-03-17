package com.turkcell.pair2.customerservice.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

//@Entity
////@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Customer {


    //    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
    private  int id;

    //    @ManyToOne()
//    @JoinColumn(name = "customerid")
    private  Role  roleid;

    //    @OneToMany()
//    @JoinColumn(name = "contactid")
    private  Contact contactid;

    //    @Column(name = "first_name")
    private String firstName;

    //    @Column(name = "middle_Name")
    private String middleName;

    //    @Column(name = "last_name")
    private String lastName;

    //    @Column(name = "birth_date")
    private Date birthDate;

    //    @Column(name = "gender")
    private  String gender;


    //    @Column(name = "father_name")
    private String fatherName;

    //    @Column(name = "mother_name")
    private String motherName;

    //    @Column(name = "not_id")
    private long notId;
}
