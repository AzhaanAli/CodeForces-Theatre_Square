import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /** DIRECTIONS:
         * For a square of dimensions n * m, find out how many squares of size a^2 cat fit.
         */

        Scanner s = new Scanner(System.in);

        String[] input = s.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        double a = Double.parseDouble(input[2]);

        System.out.println((long)(Math.ceil(n / a) * Math.ceil(m / a)));


    }

}