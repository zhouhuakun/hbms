package com.huayan.hbms.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
import javax.persistence.*;
@Data
public class Coffee {
    private Integer coffeeId;
    private String coffeeImage;
    private String coffeeType;
    private BigDecimal coffeePrice;
    private String coffeeDetails;
    private Integer coffeeStatu;
    private String typeId;
}