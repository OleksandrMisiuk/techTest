package com.santa.techtest.controller;

import com.santa.techtest.dto.Book;
import com.santa.techtest.dto.OrderDto;
import com.santa.techtest.model.Bill;
import com.santa.techtest.model.Package;
import com.santa.techtest.service.CounterService;
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
    private CounterService counterService;

    @Autowired
    public MainController(OrderService orderService, CounterService counterService) {
        this.orderService = orderService;
        this.counterService = counterService;
    }

    @ResponseStatus(HttpStatus.FOUND)
    @PostMapping(value = "/filter", produces = MediaType.APPLICATION_JSON_VALUE,
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Package> filterPackages(@RequestBody OrderDto orderDto){
        return orderService.filterPackages(orderDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "/order", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Bill orderPackage(@RequestBody Book book){
        return counterService.getBill(book);
    }
}
