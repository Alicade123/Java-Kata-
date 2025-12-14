import java.util.ArrayList;
import java.util.List;

public class _6kyu_AreTheySame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));//true
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        List<Integer> bb = new ArrayList<>();
        for (int value : b) {
            bb.add(value);
        }

        for (int i = 0; i < a.length; i++) {
            int square = a[i] * a[i];
            boolean found = false;

            for (int j = 0; j < bb.size(); j++) {
                if (bb.get(j) == square) {
                    bb.remove(j);
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}