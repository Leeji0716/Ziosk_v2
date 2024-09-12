package com.example.backend.Controller;

import com.example.backend.Service.MultiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menuItem")
public class MenuItemController {
    private final MultiService multiService;
}
