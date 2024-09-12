package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    @ManyToOne
    private Category category;

    @OneToMany(cascade = CascadeType.REMOVE)
    private List<MenuItem> menuItemList = new ArrayList<>();

    @Builder
    public Menu(String name, Long price, List<MenuItem> menuItemList){
        this.name = name;
        this.price = price;
        this.menuItemList = menuItemList;
    }
}
