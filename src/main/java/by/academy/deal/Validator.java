package by.academy.deal;

import java.util.regex.Pattern;

public interface Validator {
    Pattern getPattern();

     default boolean isValid(String phoneNumber) {
        return getPattern().matcher(phoneNumber).matches();
    }
}
