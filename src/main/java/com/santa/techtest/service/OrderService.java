package com.santa.techtest.service;

import com.santa.techtest.dto.OrderDto;
import com.santa.techtest.model.Package;

import java.util.List;

public interface OrderService {
        List<Package> filterPackages(OrderDto order);
}
