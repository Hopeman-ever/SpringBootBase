package com.hopeman.dao.impl;

import com.hopeman.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("running...");
    }
}
