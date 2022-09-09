package day18_garbageCollection;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {

        String str;
        int
                frequency=0,
                highestFrequency =0;
        int highestIndex=0;
        String ch="";

        Scanner scanner=new Scanner(System.in);

        System.out.println("Type a string:");
        str= scanner.nextLine();


        for (int i=0;i<str.length();i++){
            frequency=0;
            for (int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                    frequency++;
            }
            if(frequency >= highestFrequency )
                highestFrequency = frequency;


        }

        for (int i=0;i<str.length();i++){
            frequency=0;
            for (int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                    frequency++;
            }
            if(frequency >= highestFrequency && !ch.contains(str.charAt(i)+""))
                ch+= str.charAt(i) + "\t";



        }

        System.out.println("--------------------------");
        System.out.println("Input = " + str);
        System.out.println("--------------------------");
        System.out.println("Output = " + ch);
        System.out.println("Frequency of output = " + highestFrequency);


    }
}
