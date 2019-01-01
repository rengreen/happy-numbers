import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        for (long start=1; start<=20; start++) {
            long number = start;
            long sum = 0;
            int digit = 0;
            for (int i = 1; i < 50; i++) {
                sum = 0;
                while (number > 0) {
                    digit = (int) (number % 10);
                    sum += digit * digit;
                    number /= 10;
                }
                number = sum;
                System.out.print(number + " ");
            }
            System.out.println("");
        }
    }
}
