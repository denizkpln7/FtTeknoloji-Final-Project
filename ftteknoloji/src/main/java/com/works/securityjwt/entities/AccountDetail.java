package com.works.securityjwt.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class AccountDetail
{
    @Id
    private Long id;

    private String email;

    private String name;

    private String lastname;

    private double dolar;

    private double tl;

    private double euro;

    private double gold;

}
