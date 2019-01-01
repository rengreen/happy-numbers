import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Long> cycle = new ArrayList<>();
        Collections.addAll(cycle, 4L, 16L, 37L, 58L, 89L, 145L, 42L, 20L);

        for (long start=1; start<=2019; start++) {
            long number = start;
            long sum = 0;
            int digit = 0;

            do {
                sum = 0;
                while (number > 0) {
                    digit = (int) (number % 10);
                    sum += digit * digit;
                    number /= 10;
                }
                number = sum;
            } while(number!=1 && !cycle.contains(number));

            if (number==1L){
                System.out.println(start);
            }
        }
    }
}
