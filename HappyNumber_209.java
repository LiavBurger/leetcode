import java.util.HashSet;

public class HappyNumber_209 {
    public static void main (String[] args) {
        int n = 0;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int newN = 0;
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            if (n == 1)
                return true;
            while (n != 0) {
                newN += Math.pow(n % 10, 2);
                n = n/10;
            }
            if (set.contains(newN))
                return false;
            set.add(newN);
            n = newN;
            newN = 0;
        }
    }
}
