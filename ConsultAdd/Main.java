
// We have string which contains characters 

// Input format be like 

// First line contains string
// Second line contains integer
// Third line contains character 

// Test case 1 : 
// ===========
// Input :  

// String str=  abcc
// Int m=  2

// a  b
// c  b 

// Output :  YES

// Test case 2 : 
// ============

// String str=  abcd
// Int m=  2

// a  b
// c  b 

// Output :  NO

// Test case 3: 
// ============

// String str=  abc
// Int m=  2

// a  b
// c  d

// Output :  NO

// -----------------------------------------------------------------------------------
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int m = sc.nextInt();

        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < m; i++) {
            char ch1 = sc.next().charAt(0);
            char ch2 = sc.next().charAt(0);
            hs.add(ch1);
            hs.add(ch2);
        }

        HashSet<Character> h = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            h.add(s.charAt(i));
        }

        if (h.size() != hs.size()) {
            System.out.println("NO");
            return;
        }

        for (Character ch : hs) {
            if (!h.contains(ch)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        return;
    }
}