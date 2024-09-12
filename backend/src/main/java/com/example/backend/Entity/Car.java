package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String first;

    private String end;

    private LocalDateTime parkingTime;

    private LocalDateTime freeTime;

    @OneToOne
    @JoinColumn(name = "site_order_id", nullable = false)  // 외래 키 설정
    private SiteOrder siteOrder;

    @Builder
    public Car (String first, String end){
        this.first = first;
        this.end = end;
        this.parkingTime = LocalDateTime.now();
    }
}