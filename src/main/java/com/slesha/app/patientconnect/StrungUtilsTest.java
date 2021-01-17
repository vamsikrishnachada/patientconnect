package com.slesha.app.patientconnect;

import org.springframework.util.StringUtils;

public class StrungUtilsTest {
    public static void main(String[] args) {
        System.out.println(StrungUtilsTest.class.getSimpleName());
        System.out.println(StringUtils.uncapitalize(""));
        String personType = "Doctor";
        switch (personType) {
            case "Doctor":
                System.out.println(personType);
                break;
            default:
                System.out.println("Not valid");
                break;

        }

    }
}
