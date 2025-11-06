public class _6kyu_SimplePrimeStreaming2 {
    public static void main(String[] arg) {
        System.out.println(solve(20, 9)); // Expected: "414347535"
    }

    public static String solve(int a, int b) {
        StringBuilder primesConcat = new StringBuilder();
        int num = 2;

        // Keep generating primes until the sequence is long enough
        while (primesConcat.length() < a + b) {
            if (isPrime(num)) {
                primesConcat.append(num);
            }
            num++;
        }

        // Extract substring
        return primesConcat.substring(a, a + b);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
