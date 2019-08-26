package com.huayan.hbms.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Data
public class CoffeeShop {
    private Integer sid;
    private String typeId;
    private String type;
}