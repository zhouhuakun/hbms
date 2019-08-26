package com.huayan.hbms.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
import javax.persistence.*;
@Data
public class Ice {
    private Integer iceId;
    private String iceImage;
    private String iceType;
    private BigDecimal icePrice;
    private String iceDetails;
    private Integer iceStatu;
    private String typeId;
}