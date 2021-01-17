package com.slesha.app.patientconnect.model;

import com.slesha.app.patientconnect.enums.PhoneNumberType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public abstract class Person implements Serializable {
    @Id
    private Integer id;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String emailAddress;
    private PhoneNumberType phoneNumberType;

}
