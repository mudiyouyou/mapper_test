package com.mudiyouyou.mapper.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;

@Data
public class Country {
    @Id
    @KeySql
    private Integer id;
    private String countryName;
    private String countryCode;
}
