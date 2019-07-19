package com.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Data
@EqualsAndHashCode
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "SURNAME")
    private String surname;
}
