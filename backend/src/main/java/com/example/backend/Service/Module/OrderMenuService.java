package com.example.backend.Service.Module;

import com.example.backend.Repository.OrderMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderMenuService {
    private final OrderMenuRepository orderMenuRepository;
}
