package com.mudiyouyou.mapper;

import com.mudiyouyou.mapper.entity.Country;
import com.mudiyouyou.mapper.repository.CountryMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MapperMain.class})
public class MapperTest {
    @Autowired
    private CountryMapper countryMapper;
    @Test
    public void testInsert(){
        Country country = new Country();
        country.setCountryCode("114");
        country.setCountryName("China");
        countryMapper.insert(country);
        log.info(country.getId().toString());
    }

    @Test
    public void testSelectById(){

    }

    @Test
    public void testSelectByCol(){

    }

    @Test
    public void testUpdateSelective(){

    }
}
