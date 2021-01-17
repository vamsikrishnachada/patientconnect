package com.slesha.app.patientconnect.model;

import com.slesha.app.patientconnect.enums.OrderStatus;
import com.slesha.app.patientconnect.enums.OrderType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Order implements Serializable {
    @Id
    private Long id;
    private LocalDateTime orderDate;
    private OrderType orderType;
    private Double grossAmount;
    private Double discountAmount;
    private Double salesTax;
    private Double tipAmount;
    private Double totalOrderAmount;
    private OrderStatus status;

}
