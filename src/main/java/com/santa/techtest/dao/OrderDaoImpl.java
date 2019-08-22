package com.santa.techtest.dao;

import com.santa.techtest.mapper.PackageMapper;
import com.santa.techtest.model.Package;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    private JdbcTemplate jdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(OrderDaoImpl.class);
    private PackageMapper packageMapper;

    @Autowired
    public OrderDaoImpl(DataSource dataSource, PackageMapper packageMapper) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.packageMapper = packageMapper;
    }

    @Override
    public List<Package> filterPackages(String order) {
        return this.jdbcTemplate.query(order, this.packageMapper);
    }
}
