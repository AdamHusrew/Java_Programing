package day16_nestedLoop;

import java.util.Scanner;

public class UniqueChars {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String
                input,
                result="";

        char
                chi= 0,
                chj = 0;

        boolean unique=true;

        System.out.println("Enter a string:");
        input= scanner.nextLine();

        for (int i=0;i<input.length();i++){
            unique=true;
            for (int j=i;j<input.length();j++){

                if( j!=i && input.charAt(i)==input.charAt(j)){
                    unique=false;
                    break;

                }
            }

            if (unique)
                result+=input.charAt(i);


        }

        System.out.println("Output: " + result);

    }
}
/*
10. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

      Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
                        if frequency of a character == 1  =========> unique

 */