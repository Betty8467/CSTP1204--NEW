package Lab7;


import java.util.Set;
import java.util.HashSet;

public class SortaSquare {

	/**
	 * Return a subset of SortaSquares from the integers in set s.
	 * 
	 * @param s
	 *            the set from which we want to extract SortaSquares
	 * @return a subset with all the SortaSquares in s
	 */
	public static Set<Integer> getSortaSquares(Set<Integer> s) {
		// TODO: Implement this method
        Set<Integer> results = new HashSet<Integer>();
        for (Integer x : s ){
            if (square(x)) {
                results.add(x);
            }
            ;
        }

		return new HashSet<Integer>();
	}

    private static boolean square(Integer x) {
        boolean answ = false;
        int a = 0;
        int b = (int)Math.sqrt(x);
        int n = 0;
        while (b > 0) {
            a = 1;
            while (a < b) {
                n = a * b * b;
                if (n == x) {
                    return true;
                }
                a++;
            }
            b--;
        }
        return answ;
}
}