package practice;
import java.util.Scanner;
import java.util.Arrays;

public class practice1 {
    public static void main(String[] args){
        //1
        System.out.println("Hello");
        //2
        int one = 1;
        int two = 2;

        System.out.println( one + two);

        //3
        Scanner user = new Scanner (System.in);
        System.out.println("Please enter the first number: ");
        int num1 = user.nextInt();
        System.out.println("Please enter a second number: ");
        int num2 = user.nextInt();

        int result = num1 + num2;

        if(result < 0){
            System.out.println("This answer is negative");
        }
        else if (result > 0){
            System.out.println("This answer is positive");
        }

        //4 Arrays

        int[] numArray = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int i : numArray)
            sum+= i;
        System.out.println(sum);

        //5 Array duplicates

        int[] array2 = {1, 2, 3, 4,5 ,6};

        for(int i =0; i< array2.length; i++){
            for(int n = i+1; n < array2.length; n++){
                if((array2[i] == array2[n] && (i != n))){
                    System.out.println("The duplicate numbers are " + array2[n]);
                }
            }

        }

        //6 Array leap year
            Scanner in = new Scanner(System.in);
            System.out.print("Input a year: ");
            int year = in.nextInt();

            System.out.println(is_LeapYear(year));



        }



        public static boolean is_LeapYear(int y)
        {
            boolean a = (y % 4) == 0;
            boolean b = (y % 100) != 0;
            boolean c = ((y % 100 == 0) && (y % 400 == 0));

            return a && (b || c);
    }


}
