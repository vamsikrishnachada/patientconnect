package com.slesha.app.patientconnect.model;

import javax.persistence.Id;
import java.io.Serializable;

public class OrderItem implements Serializable {
    @Id
    private Long id;
    private MenuItem menuItem;
    private String qty;
}
