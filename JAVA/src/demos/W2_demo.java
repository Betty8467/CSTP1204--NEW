/* 
package demos;

import java.util.ArrayList;
import java.util.List;

public class W2_demo {
    public static void main(String[] args) {
        List<Integer> aList = new <Integer> ArrayList();
        System.out.println(aList.size()); //0
        aList.add(1);
        aList.add(1);
        aList.remove(1);
        System.out.println(aList.size()); //1

        Integer max = Integer.MIN_VALUE;
        for(Integer x : aList){
            max = Math.max(x, max);
        }
        System.out.println(max);

    }
}

*/
