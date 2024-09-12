package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Menu product;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Builder
    public MenuItem(Menu product, Item item){
        this.product = product;
        this.item = item;
    }
}
