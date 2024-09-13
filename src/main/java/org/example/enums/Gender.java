package org.example.enums;

public enum Gender {
    MALE("Male", 0), // ONLY one object ever of the MALE child class of Gender
    FEMALE("Female", 1),
    UNSPECIFIED("Unspecified", 2),
    OTHER_OTHER_OTHER("other", 4);

    private final String displayName;
    private final int order;

    Gender(String displayName, int order) {this.displayName = displayName;
        this.order = order;
    }

    public String getDisplayName() {
        return displayName;
    }

    // Enums in JAVA actually have super powers
}
