public class lcm {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 12;
        int gcd = 1;
        int lcm = 1;
        int smallest = Math.min(n1, n2);
        for (int i = smallest; i >= 1; i--) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                gcd = i;
                break;
            }
        }
        lcm = (n1 * n2) / gcd;
        System.out.println(lcm);
    }
}
