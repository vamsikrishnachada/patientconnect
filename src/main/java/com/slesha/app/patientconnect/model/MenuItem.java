package com.slesha.app.patientconnect.model;

import com.slesha.app.patientconnect.enums.ItemCategoryType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MenuItem {
    @Id
    private Long id;

    private String desc;
    private ItemCategoryType itemCategoryType;
    private Double price;
    private ItemStatus status;
}
