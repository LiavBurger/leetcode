import java.util.LinkedHashMap;

public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        LinkedHashMap <Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), 1);
            else
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }

        boolean takenOdd = false;
        int total = 0;

        for (Character ch: map.keySet()) {
            if (map.get(ch) % 2 == 0)
                total += map.get(ch);

            else if (!takenOdd && map.get(ch) % 2 == 1) {
                total += map.get(ch);
                takenOdd = true;
            }

            else
                total += map.get(ch) - 1;
        }
        return total;
    }
}
