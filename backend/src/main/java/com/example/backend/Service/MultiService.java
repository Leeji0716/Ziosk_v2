package com.example.backend.Service;

import com.example.backend.Service.Module.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MultiService {
    private final CarService carService;
    private final CategoryService categoryService;
    private final ItemService itemService;
    private final MenuService menuService;
    private final MenuItemService menuItemService;
    private final SiteOrderService siteOrderService;
    private final OrderMenuService orderMenuService;
    private final OrderItemService orderItemService;
    private final SiteUserService siteUserService;

}
