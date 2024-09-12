package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class OrderMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    private Long count;

    private Long total;

    @OneToMany(mappedBy = "orderMenu", cascade = CascadeType.REMOVE)
    private List<OrderItem> orderItemList;
}
