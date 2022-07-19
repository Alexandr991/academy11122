package by.academy.deal;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
    private static final Pattern phoneNumber = Pattern.compile("\\+1[0-9]{3}[0-9]{7}");
    @Override
    public Pattern getPattern() {
        return phoneNumber;
    }

    @Override
    public boolean isValid(String phoneNumber) {
        if(getPattern().matcher(phoneNumber).matches()){
            System.out.println("It's American phone number.");
        }
        else {
            System.out.println("You enter incorrect number!");
        }
        return getPattern().matcher(phoneNumber).matches();
    }
}
