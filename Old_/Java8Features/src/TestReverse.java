
public class TestReverse {

    public static void main(String[] args) {

        MyStringReverse sr = (s1) -> {

            int n = s1.length();
            int j = 0;
            char[] t = new char[n];

            for (int i = n - 1; i >= 0; i--) {
                t[j] = s1.charAt(i);
                j++;
            }

            return new String(t);
        };

        System.out.println(sr.Reverse("PRASAD")); // Output: DASARP
    }
}
