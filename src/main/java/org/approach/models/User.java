package org.approach.models;

import static org.apache.commons.lang3.Validate.*;

public class User {
    private final Long id;
    private final Username username;

    public User(final Long id, final Username username) {
        this.id = notNull(id, "The id must not be null");
        this.username = notNull(username, "The username must not be null");
    }
}
