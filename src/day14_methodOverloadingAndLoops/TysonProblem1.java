package day14_methodOverloadingAndLoops;

import java.util.Scanner;

public class TysonProblem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String str = input.next();

        String result = "";

        for (int i = 0; i < str.length()-1;i++) {

            if (str.charAt(i)== str.charAt(i+1)){
                while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
                    i++;
                result += str.charAt(i);

            }



        }

        System.out.println("String : " +str);
        System.out.println("result = " + result);



    }
}

