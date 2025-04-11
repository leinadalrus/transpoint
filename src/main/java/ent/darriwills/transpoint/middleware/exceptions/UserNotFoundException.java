package ent.darriwills.transpoint.middleware.exceptions;

public class UserNotFoundException extends RuntimeException {
    UserNotFoundException(Long id) {
        super("Cannot find the inputted user with:\t" + id);
    }
}