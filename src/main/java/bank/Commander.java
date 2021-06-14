package bank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Commander {

    Bank bank = new Bank();
    public void readCommand(){
        Scanner sc = new Scanner(System.in);

        final String regex = "^(name) ([a-zA-Z]+)$";
        final String regex1 = "^(addemployee) ([A-Za-z]+),([A-Za-z]+),([0-9]{3,4})$";
        final String regex2 = "^(printemployee)$";


        while(true) {
            String input = sc.nextLine();
             Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                bank.setName(matcher.group(2).trim());
                System.out.println("OK");
            }


           pattern = Pattern.compile(regex1, Pattern.MULTILINE);
            matcher = pattern.matcher(input);
            if (matcher.find()) {
                int salary = Integer.parseInt(matcher.group(4));
                bank.addEmployee(matcher.group(2), matcher.group(3), salary);
                System.out.println("OK");
            }

            pattern = Pattern.compile(regex2, Pattern.MULTILINE);
            matcher = pattern.matcher(input);
            if (matcher.find()) {

                bank.printEmployes();

            }
        }
    }

    public static void main(String[] args) {
        new Commander().readCommand();
    }
}

