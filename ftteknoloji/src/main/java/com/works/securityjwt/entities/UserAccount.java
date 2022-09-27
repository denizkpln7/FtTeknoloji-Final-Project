package com.works.securityjwt.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userıd;

    private double tl;
    private double dolar;
    private double euro;
    private double gold;

    private String text;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date created;

}
