// Chase Batchelor
// CPSC-39
// April 12, 2026

public class RecursionPractice {
    // Counts occurrences of the number 8 recursively
    public static int count8(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;
        int nextDigit = (n / 10) % 10;

        if (lastDigit == 8) {
            if (nextDigit == 8) {
                return 2 + count8(n / 10);
            }
            return 1 + count8(n / 10);
        }

        return count8(n / 10);
    }

    // Counts how many times "hi" appears
    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        }

        return countHi(str.substring(1));
    }

    // Counts "hi" but ignores ones that have an 'x' immediately before them
    public static int countHi2(string str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
            return countHi2(str.substring(3));
        }

        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        return countHi2(str.substring(1));
    }
}