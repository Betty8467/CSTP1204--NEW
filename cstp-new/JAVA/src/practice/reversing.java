package practice;

public class reversing {
    public static void main (int[] args){
        int r = reverse(123);
        System.out.println(r);
    }

    public static int reverse (int x){
        long r = 0;
        while(x != 0){
            r = r*10 + x%10;
            x /= 10;
        }
        if( r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE )
            return (int)r;
        else
            return 0;
    }
}

