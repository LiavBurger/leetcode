import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


public class FindAllAnagramsInAString_438 {
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        if (p.length() > s.length())
            return list;
        HashMap <Character, Integer> sCount = initiateMap(s, p.length());
        HashMap <Character, Integer> pCount = initiateMap(p, p.length());

        int start = 0, end = p.length()-1;
        while (true) {
            if (sCount.keySet().equals(pCount.keySet())) {
                if (letterCountMatch(sCount, pCount))
                    list.add(start);
            }
            end += 1;
            if(end == s.length())
                break;
            updateMap(sCount, start, end, s);
            start += 1;
        }
        return list;
    }

    private static boolean letterCountMatch(HashMap<Character, Integer> sCount, HashMap<Character, Integer> pCount) {
        for (Character letter : sCount.keySet()) {
            if (!Objects.equals(sCount.get(letter), pCount.get(letter)))
                return false;
        }
        return true;
    }

    private static void updateMap(HashMap<Character, Integer> map, int start, int end, String string) {
        char oldStartChar = string.charAt(start);
        char newEndChar = string.charAt(end);

        if (map.get(oldStartChar) - 1 == 0)
            map.remove(oldStartChar);
        else
            map.put(oldStartChar, map.get(oldStartChar)-1);

        if (map.containsKey(newEndChar))
            map.put(newEndChar, map.get(newEndChar)+1);
        else
            map.put(newEndChar, 1);
    }

    private static HashMap<Character, Integer> initiateMap(String string, int length) {
        HashMap <Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(string.charAt(i)))
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
            else
                map.put(string.charAt(i), 1);
        }
        return map;
    }
}
