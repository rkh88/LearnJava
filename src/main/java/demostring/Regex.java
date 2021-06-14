package demostring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {


    public static void main(String[] args) {
        final String regex = "^[a-zA-Z]+[a-zA-z0-9]+;[0-9]{2,4}$";
        final String string = "AAeq45;3212\n"
                + "AQ23TR;trr2\n"
                + "4321;hffgf\n"
                + "Tv fqefvf\n"
                + "Asas23;232123\n"
                + "Asas23;23212\n"
                + "Asas23;23\n"
                + "Asas23;2";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
