package com.javatechi.crud.exemple.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="PRODUCT_TBL")
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String localDate;
    private int age;

}
