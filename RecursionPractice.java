// Chase Batchelor
// CPSC-39
// April 12, 2026

public class RecursionPractice {
    // Counts occurrences of the number 8 recursively

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