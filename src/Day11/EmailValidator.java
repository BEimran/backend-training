package Day11;

import java.util.regex.*;
import java.util.*;

public class EmailValidator {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user@example.com",
                "user.name@domain.org",
                "invalid-email@domain",
                "user@domain_net",
                "@missinguser.com"
        );
        String emailRegex = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
        Pattern pattern = Pattern.compile(emailRegex);
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + ": Valid");
            } else {
                System.out.println(email + ": Invalid");
            }
        }
    }
}

