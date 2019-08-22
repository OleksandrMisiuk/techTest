package com.santa.techtest.dao;

import com.santa.techtest.model.Package;

import java.util.List;

public interface OrderDao {
    List<Package> filterPackages(String order);
}
