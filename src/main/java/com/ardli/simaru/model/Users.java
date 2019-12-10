package com.ardli.simaru.model;

import javax.persistence.*;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * User
 */
@Entity
@Table(name = "users")
public class Users {

    // @GeneratedValue
    @Id
    private int id;

    @Getter
    @Setter
    private String nama;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String no_telp;
    @Getter
    @Setter
    private String jk;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String role;
}