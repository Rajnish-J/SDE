import java.util.ArrayList;
import java.util.List;

public class divisorsoftheNumber {
    public static void main(String[] args) {
        int n = 6;
        List<Integer> divisors = new ArrayList<>();
        divisors.add(1);
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        System.out.println(divisors.stream().mapToInt(Integer::intValue).toArray());
    }
}
