package com.example.project.product;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@ToString
@NoArgsConstructor
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long number;

    private String name;

    @Column(nullable = false)   //null 허용
    private long price;

    private long stock;


}
