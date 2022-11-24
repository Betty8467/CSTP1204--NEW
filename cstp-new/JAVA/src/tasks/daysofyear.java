/* 
package tasks;

    class task1 {
    public static void main(String[] args) {
        //    System.out.println(dayOfYear( Month.JUNE, 22, 2022)); //should fail fast
        //   System.out.println(Month.JUNE.ordinal() + 1);
        System.out.println(isLeap(2001)); // false
        System.out.println(isLeap(0202)); // true
        System.out.println(isLeap(2401)); // false
        System.out.println(isLeap(2400));
        ; // true
    }

    public static enum Month {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

    private static int dayOfYear(Month month, int dayOfMonth, int year) {

        int[] monthLengths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i = 1; i < month.ordinal() + 1; i++) {
            sum += monthLengths[i - 1];
        }
        sum += dayOfMonth;
        return sum;
    }


    private static boolean isLeap(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;

        }
    }

}

*/
