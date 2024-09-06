package org.example.staticfinal;

public final class Utils { // We cannot extend Utils
    private static final String UNDERSCORE = "_"; // CONSTANT_FIELD_NAME = "hello", constant
    private static final String ID_PREFIX = "ID-000";

    // string "mahmoud" -> "_mahmoud"
    public static String prefixWithUnderscore(final String s) {
        return UNDERSCORE + s;
    }
}
