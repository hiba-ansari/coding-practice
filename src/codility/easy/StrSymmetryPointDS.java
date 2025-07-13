package codility.easy;

public class StrSymmetryPointDS {
    public int solution(String S) {
        int n = S.length();
        if (n == 1) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            String left = S.substring(0, i);
            String right = S.substring(i + 1);
            if (isReverse(left, right)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isReverse(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int n = a.length();
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
