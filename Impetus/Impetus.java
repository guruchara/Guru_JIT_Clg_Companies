import java.util.*;

public class Impetus {

    static int c = 0;

    public static int dist(String s) {
        // distinct character
        HashSet<Character> h = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            h.add(s.charAt(i));
        }
        if (h.size() == s.length()) {
            c++;
        }
        return c;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                // System.out.println(s.substring(i, j));
                int x = dist(s.substring(i, j));
                if (i == s.length() - 1) {
                    System.out.println(x);
                }
            }
        }
    }
}

// ----------------------------------------------------------
