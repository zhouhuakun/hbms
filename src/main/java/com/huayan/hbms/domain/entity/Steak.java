package com.huayan.hbms.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
import javax.persistence.*;

@Data
public class Steak {
    private Integer steakId;
    private String steakImage;
    private String steakType;
    private BigDecimal steakPrice;
    private String steakDetails;
    private Integer steakStatu;
    private String typeId;
}