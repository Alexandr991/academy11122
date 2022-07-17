package by.academy.deal;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
    private static final Pattern phoneNumber = Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}");

    @Override
    public Pattern getPattern() {
        return phoneNumber;
    }

    @Override
    public boolean isValid(String phoneNumber) {
        if (getPattern().matcher(phoneNumber).matches()) {
            System.out.println("It's Belarus phone number.");
        } else {
            System.out.println("You enter incorrect number!");
        }
        return getPattern().matcher(phoneNumber).matches();
    }
}
