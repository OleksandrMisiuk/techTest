package com.santa.techtest.service;

import com.santa.techtest.dao.OrderDao;
import com.santa.techtest.dto.OrderDto;
import com.santa.techtest.model.Package;
import com.santa.techtest.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;
    @Autowired
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    private StringBuilder queryOrder;

    @Override
    public List<Package> filterPackages(OrderDto order) {
        queryOrder = new StringBuilder(Query.QUERY_FOR_ORDER);
        if(!order.getCountry().isEmpty()){
            queryOrder.append("AND country.name like '" + order.getCountry() + "%' ");
        }
        if(!order.getCity().isEmpty()){
            queryOrder.append("AND city.name like '" + order.getCity() + "%' ");
        }
        if(order.getDateDepart()!=null){
            queryOrder.append("AND package.date_depart = '" + order.getDateDepart() + "' ");
        }
        if(order.getNumberOfPeople()>0){
            queryOrder.append("AND room.seats = '" + order.getNumberOfPeople() + "' ");
        }
        if(order.getSeaDistance()>0){
            queryOrder.append("AND hotel.sea_distance = '" + order.getSeaDistance() + "' ");
        }
        if(!order.getRoomType().isEmpty()){
            queryOrder.append("AND room.type like '" + order.getRoomType() + "%' ");
        }
        if(!order.getMeal().isEmpty()) {
            queryOrder.append("AND meal.type like '" + order.getMeal() + "%' ");
        }
        if(order.getHotelRating()>0){
            queryOrder.append("AND hotel.rating = '" + order.getHotelRating() + "' ");
        }
        if(order.isInsurance()){
            queryOrder.append("AND package.insurance = '" + order.isInsurance() + "' ");
        }
        if(order.isTransfer()){
            queryOrder.append("AND package.transfer = '" + order.isTransfer() + "' ");
        }
        if(order.isVisa()){
            queryOrder.append("AND package.visa = '" + order.isVisa() + "' ");
        }
        queryOrder.append(";");
        return orderDao.filterPackages(queryOrder.toString());
    }
}
