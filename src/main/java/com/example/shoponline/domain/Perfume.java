package com.example.shoponline.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "perfumes", schema = "dbo")
@Getter
@Setter
public class Perfume
{
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "perfumer")
    private String perfumer;

    public Perfume() {}
}
