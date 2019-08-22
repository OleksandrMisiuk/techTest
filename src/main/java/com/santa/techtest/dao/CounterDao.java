package com.santa.techtest.dao;

import com.santa.techtest.dto.Book;
import com.santa.techtest.model.Counter;

public interface CounterDao {
    Counter getBill(Book book);
}
