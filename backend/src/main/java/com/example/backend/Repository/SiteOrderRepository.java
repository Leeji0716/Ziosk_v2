package com.example.backend.Repository;

import com.example.backend.Entity.SiteOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteOrderRepository extends JpaRepository<SiteOrder, Long> {
}
