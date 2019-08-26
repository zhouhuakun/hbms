package com.huayan.hbms.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
import javax.persistence.*;

@Data
public class Ielse {
    private Integer elseId;
    private String elseImage;
    private String elseType;
    private BigDecimal elsePrice;
    private String elseDetails;
    private Integer elseStatu;
    private String typeId;
}