package com.example.backend.Entity;


import com.example.backend.Enum.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class SiteOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private LocalDateTime orderTime;

    private LocalDateTime completeTime;

    @OneToOne(mappedBy = "siteOrder", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
    private Car car;
}
