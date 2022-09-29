package mattQuestion;

import java.util.Arrays;

public class ArrayOfProducts {
    public static void main(String[] args) {
        int [] input= {5, 1, 4, 2, 10, 23, 12};

        System.out.println("Input = " + Arrays.toString(input));
        int [] output=new ArrayOfProducts().arrayOfProducts(input);
        System.out.println("-----------------------");
        System.out.println("Output = " + Arrays.toString(output));

    }

    public int[] arrayOfProducts(int[] input) {

        int [] output=new int[input.length];

        for (int i=0;i<input.length;i++){
            int out=1;
            for (int j=0;j<input.length;j++){
                if (i==j)
                    continue;
                out*=input[j];
            }
            output[i]=out;
        }
        return output;


    }

}
/*
Question # 2
Description:
Array of Products
Difficulty: Medium Category: Array
Write a function that takes in a non-empty array of integers and returns an array of the same length,
where each element in the output array is equal to the product of every other number in the input array.
In other words, the value at output[i] is equal to the product of every number in the input array other than input[i] .
Note that you're expected to solve this problem without using division.


Sample


Input array = [5, 1, 4, 2]
Sample Output [8, 40, 10, 20]
// 8 is equal to 1 x 4 x 2
// 40 is equal to 5 x 4 x 2
// 10 is equal to 5 x 1 x 2 //
 20 is equal to 5 x 1 x 4
Directions :
 Solve the problem on your own.
 No group effort.
 If possible, provide more than one solution/strategy.
 Different approaches will be great for discussion.
 If you are stuck no problem. Student will experience the same.
 Do not google it. Try to build your own solution. It might be ugly no worries.
Good luck!
 */
