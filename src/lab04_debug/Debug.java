package lab04_debug;

public class Debug {

    public static void main(String[] args) {
        System.out.println("hello");


        String name = "Mike" ;
        name.substring(1,3);

        int age = 30;

        if (name.equals("Mike") && age == 0){
            System.out.println("Correct info.");

        }else {
            System.out.println("Wrong info.");

        }

        for (int i=0;i<3;i++){
            if(i==2) {

                method1();
            } else {
                method2();
                System.out.println("hello everyone");
            }
        }


    }

    private static void method2() {
        System.out.println("ınside method 1");
    }

    private static void method1() {
        System.out.println("ınsıde method 2");

    }


}
