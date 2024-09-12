package com.example.backend.Service.Module;

import com.example.backend.Repository.SiteOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SiteOrderService {
    private final SiteOrderRepository siteOrderRepository;
}
