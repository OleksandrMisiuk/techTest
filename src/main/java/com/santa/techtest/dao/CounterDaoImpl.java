package com.santa.techtest.dao;

import com.santa.techtest.dto.Book;
import com.santa.techtest.mapper.CounterMapper;
import com.santa.techtest.model.Counter;
import com.santa.techtest.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CounterDaoImpl implements CounterDao{

    private JdbcTemplate jdbcTemplate;
    private static final Logger logger = LoggerFactory.getLogger(OrderDaoImpl.class);
    private CounterMapper counterMapper;

    @Autowired
    public CounterDaoImpl(DataSource dataSource, CounterMapper counterMapper) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.counterMapper = counterMapper;
    }

    @Override
    public Counter getBill(Book book){
            return this.jdbcTemplate.queryForObject(Query.QUERY_FOR_COUNT, counterMapper,
                    book.getPackageId(), book.getRoomId(), book.getMealId());
    }
}
