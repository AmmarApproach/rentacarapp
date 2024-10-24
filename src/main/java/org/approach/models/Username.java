package org.approach.models;

import static org.apache.commons.lang3.Validate.*;

public class Username {
    private static final int MINIMUM_LENGTH = 4;
    private static final int MAXIMUM_LENGTH = 40;
    private static final String VALID_CHARACTERS = "[A-Za-z0-9_-]+";

    private final String value;

    public Username(final String value) {
        notBlank(value);
        final String trimmed = value.trim();
        inclusiveBetween(MINIMUM_LENGTH, MAXIMUM_LENGTH, trimmed.length());
        matchesPattern(trimmed, VALID_CHARACTERS, "Allowed characters are: %s", VALID_CHARACTERS);
        this.value = trimmed;
    }

    public String value() {
        return value;
    }

}
