package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    private static final Pattern email = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);
    @Override
    public Pattern getPattern() {
        return email;
    }

    @Override
    public boolean isValid(String email) {
        if(getPattern().matcher(email).matches()){
            System.out.println("You email is:" +email);
        }
        else {
            System.out.println("You enter incorrect email!");
        }
        return getPattern().matcher(email).matches();

    }


}
