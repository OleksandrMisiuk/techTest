package com.santa.techtest.service;

import com.santa.techtest.dto.Book;
import com.santa.techtest.model.Bill;

public interface CounterService {
    Bill getBill(Book book);
}
