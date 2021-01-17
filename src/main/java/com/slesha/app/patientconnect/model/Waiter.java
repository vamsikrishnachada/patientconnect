package com.slesha.app.patientconnect.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Waiter extends Person {
    String tableNumber;
    LocalDate dateofjoining;
    LocalDate dateofleaving;
    Double ratePerhour;
    Double tipsEarned;
}
