package org.approach.models;

import static org.apache.commons.lang3.Validate.*;
import java.util.Objects;

public class User {
    private static final int USERNAME_MINIMUM_LENGTH = 4;
    private static final int USERNAME_MAXIMUM_LENGTH = 40;
    private static final String USERNAME_VALID_CHARACTERS = "[A-Za-z0-9_-]+";
    private final Long id;
    private final String username;

    public User(final Long id, final String username) {
        Objects.requireNonNull(id, "The id must not be null");
        notBlank(username);
        final String trimmed = username.trim();
        inclusiveBetween(USERNAME_MINIMUM_LENGTH, USERNAME_MAXIMUM_LENGTH, trimmed.length());
        matchesPattern(trimmed, USERNAME_VALID_CHARACTERS, "Allowed characters are: %s", USERNAME_VALID_CHARACTERS);
        this.id = id;
        this.username = trimmed;
    }
}
