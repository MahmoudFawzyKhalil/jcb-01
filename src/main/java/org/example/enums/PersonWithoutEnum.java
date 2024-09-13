package org.example.enums;

public class PersonWithoutEnum {
    private String name;
    private String gender; // that means that any String is a possible gender value, "ASDSADADS"

    public PersonWithoutEnum(String name, String gender) {
        if (validateGender(gender)) {

        };
        this.name = name;
        this.gender = gender;
    }

    private boolean validateGender(String gender) {
        // When you have a limited or fixed number of values ENUMS are much better
        if (!"MALE".equals(gender) && !"FEMALE".equals(gender) && !"UNSPECIFIED".equals(gender)) {
            return false;
        }
        return true;
    }
}
