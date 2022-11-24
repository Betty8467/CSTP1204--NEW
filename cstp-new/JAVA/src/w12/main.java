package w12;
/* 
public class main {

    static void f1(int n){
        if (n < 10)
        System.out.println(n);
        else {
            f1(n/10); //all except the last digit
            System.out.println(n % 10); // last digit
            
        }
    }
    public static void main(String[]args){
       int x = 1234;
        f1(x);
    }
}

*/
public class main {
    static void vertical_numbers_recursive(int n){}

    static void vertical_numbers_iterative(int n){
        // int X = (int)Math.pow(10, (((int)(Math.log10(n) + 1)) - 1));
        // while (n != 0){
        //     System.out.println(n / X);
        //     n /= n % X;
        //     X /= 10;
        // }
        }

    static int fibonacci_recursive(int n){ 
        if (n == 0 || n == 1)
            return n;
        else
            return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
    }

    static int fibonacci_iterative(int n){
        Integer [] arr = new Integer[n + 1];
        for (int i = 0; i <= n; i++){
            if (i == 0 || i == 1)
                arr[i] = i;
            else
                arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }


    public static void main(String[]args){
    //    int x = 1234;
    //     vertical_numbers_iterative(x);

        //System.out.println(fibonacci_recursive(19));
        System.out.println(fibonacci_iterative(19));
    }

   
}