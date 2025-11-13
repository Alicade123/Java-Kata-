public class StrongestEvenNumber {
    public static void main(String[] args) {
        System.out.println(strongestEven(1, 2));     // 2
        System.out.println(strongestEven(5, 10));    // 8
        System.out.println(strongestEven(48, 56));   // 48
        System.out.println(strongestEven(129, 193)); // 192
    }

    public static int strongestEven(int n, int m) {
        int strongest = 0;
        int max = 0;

        for (int i = n; i <= m; i++) {
            if (i % 2 != 0) continue;
            int count = 0;
            int num = i;
            while (num % 2 == 0) {
                num =num/ 2;
                count++;
            }

            // if this one is stronger, remember it
            if (count > max) {
                max = count;
                strongest = i;
            }
        }

        return strongest;
    }
}
