package com;

import jdk.jfr.events.ThrowablesEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PayServiceImpl implements  PayService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void pay() {
        String sql = "update user set name = '小名' where id =1";
        jdbcTemplate.execute(sql);
        int i = 1/0;
    }
}
