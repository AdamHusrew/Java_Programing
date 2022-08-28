package day04_concatenation;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        // byte<short<int<long<float<double
        //--------Implicit Casting-------
        // you do not need to use casting operator


        byte a=15;

        short b=(short)a; //explicit casting

        int c=a; //implicit caqsting

        System.out.println("a:"+a);
        System.out.println("b:"+b);

        long d=3000l;

        float f=d;//implicit;

        //-------Explicit Casting-------
        //you must use casting operator

        int x=130;

        byte y=(byte)x;

        System.out.println("Y:"+y);

        float z=20.5f;

        short q=(short)z;

        System.out.println("q:"+q);

        int o=100;

        double k=o;

        System.out.println(k);










    }

}
