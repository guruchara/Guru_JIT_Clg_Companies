import java.util.*;

public class Guru1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int m = sc.nextInt();

        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i <m; i++) {
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