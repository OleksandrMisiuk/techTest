package com.santa.techtest.controller;

import com.santa.techtest.dto.OrderDto;
import com.santa.techtest.model.Package;
import com.santa.techtest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/packages")
public class MainController {

    private OrderService orderService;

    @Autowired
    public MainController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ResponseStatus(HttpStatus.FOUND)
    @PostMapping(value = "/filter", produces = MediaType.APPLICATION_JSON_VALUE,
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Package> filterPackages(@RequestBody OrderDto orderDto){
        return orderService.filterPackages(orderDto);
    }
}
