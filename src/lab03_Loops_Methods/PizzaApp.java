package lab03_Loops_Methods;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {

        System.out.println("Welcome to Best Pizza In Town");
        System.out.println("Please log in before placing the order");

        //Create 3 variables email, account_number, password, login_type and a scanner object
        Scanner scanner = new Scanner(System.in);
        String
                email = "mike@gmail.com",
                givenEmail;
        int accountNumber = 123;
        String password = "password";
        int logInType = 0;



        //Ask customer if she/he wants to log in with email(1) or account number(2)
        System.out.println("------------------------------");
        System.out.println("Please chose your log in type.\n\t(1)Email\n\t(2)Account Number");
        System.out.print("Your choice:");
        logInType = scanner.nextInt();

        for(int i=3;i>0;) {



            switch (logInType) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.print("Enter your email:");
                    givenEmail = scanner.next();

                    //Check if the email address valid:
                    if (isEmailValid(givenEmail) || isEmailDomainValid(givenEmail)){
                        System.out.println("Invalid Email. Please try again.");
                        continue;
                    }

                    //Enter your password
                    System.out.println("------------------------------");
                    System.out.println("Please enter your password:");
                    String givenPassword = scanner.next();

                    //Check if log in successful
                    if ((email.equals(givenEmail) && password.equals(givenPassword))) {
                        System.out.println("---------Successfully logged in with email-----------");
                        break;
                    } else {
                        if (--i!=0){
                            //Ask again
                            System.out.println("------------------------------");
                            System.out.println("Invali credentials");
                            System.out.println("You have " + i + " attempts to try.");
                            continue;
                        }else {
                            System.out.println("Your account is locked - try again tomorrow");
                            System.exit(2); //close the execution of jvm

                        }



                    }
                    break;


                case 2:
                    System.out.println("Account number log in chosen.");
                    break;
            }
            break;
        }


    }

    public static boolean isEmailDomainValid(String givenEmail) {
        //Check if the domain is valid.
        String domain = givenEmail.substring(givenEmail.indexOf("@") + 1, givenEmail.indexOf("."));
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

        return !checkDomain;

    }

    public static boolean isEmailValid(String givenEmail) {
        //Check if the email address valid:
        int
                firstSignOfIndex = givenEmail.indexOf('@'),
                secondSignOfIndex = givenEmail.indexOf('.');

        boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;


        return  checkEmail;
    }


}
