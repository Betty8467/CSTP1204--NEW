/* 
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class HelloWorld {

    static void f1(){
        System.out.println("f1 has been executed");
    }
    public static void main(String[] args) {
       //Set<Integer> x = new HashSet<>();
        MySet x = new MySet();
        x.add(11);
        x.add(12);
        x.add(13);
        x.add(14);
        x.add(15);
        x.remove(11);


        System.out.println(x.size());
        System.out.println(x.contains(11));

        BigInteger y = new BigInteger( "5");
        BigInteger w = new BigInteger("6");
        System.out.println(y.add(w).toString());


        int yy = 5/2;
        System.out.print(yy);


    }
}

*/