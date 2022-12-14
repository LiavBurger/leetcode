public class leetcode392 {

    public static void main(String[] args) {
        String s = "";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;

        if(s.length() == 0)
            return true;

        int i=0, j=0;

        while (j < t.length() && i <s.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else {
                j++;
            }
            if (i == s.length())
                return true;
        }
        return false;
    }
}