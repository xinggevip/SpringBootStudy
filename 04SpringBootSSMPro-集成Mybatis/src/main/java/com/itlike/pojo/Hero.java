package com.itlike.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Hero {
    private Integer id;
    private String username;
    private String profession;
    private String phone;
    private String email;
    private Date onlinetime;
}
