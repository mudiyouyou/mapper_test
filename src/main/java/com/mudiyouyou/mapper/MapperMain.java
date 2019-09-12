package com.mudiyouyou.mapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootApplication
@MapperScan("com.mudiyouyou.mapper.repository")
public class MapperMain {
    public static void main(String[] args) {
        SpringApplication.run(MapperMain.class);
        log.info("MapperMain is running.");
        while (true) {
            try {
                TimeUnit.HOURS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
