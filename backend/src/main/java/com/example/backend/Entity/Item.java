package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<MenuItem> menuItemList = new ArrayList<>();

    @Builder
    public Item (String name, Long price, List<MenuItem> menuItemList){
        this.name = name;
        this.price = price;
        this.menuItemList = menuItemList;
    }
}
