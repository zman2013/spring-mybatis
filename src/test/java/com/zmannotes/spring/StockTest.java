package com.zmannotes.spring;

import com.zmannotes.spring.mybatis.dao.StockMapper;
import com.zmannotes.spring.mybatis.domain.Stock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zman on 2016/5/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/stock-session-factory.xml")
public class StockTest {
    @Autowired
    private StockMapper stockMapper;

    @Transactional
    @Test
    public void test(){
        Stock stock = new Stock();
        stock.setCode("900001");
        stock.setName("tcl");
        stockMapper.insert(stock);
    }

}
