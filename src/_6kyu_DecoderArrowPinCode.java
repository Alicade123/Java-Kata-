import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _6kyu_DecoderArrowPinCode {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decArrowPinCode("1→↑→")));//1, 2, 5, 6
        System.out.println(Arrays.toString(decArrowPinCode("1*2↓")));//1, 1, 1, 0
        System.out.println(Arrays.toString(decArrowPinCode("0*2↑")));//0, 0, 0, 1
        System.out.println(Arrays.toString(decArrowPinCode("0↑↑↑")));//0, 1, 4, 7
        System.out.println(Arrays.toString(decArrowPinCode("0↑↑↑↑")));//[]
        System.out.println(Arrays.toString(decArrowPinCode("8↑*5→")));//[]
        System.out.println(Arrays.toString(decArrowPinCode("0←*2←")));//[]

    }

    public static int[] decArrowPinCode(String arrowStr) {
        List<Integer> result = new ArrayList<>();

        int current = Character.getNumericValue(arrowStr.charAt(0));
        result.add(current);

        int i = 1;
        while (i < arrowStr.length()) {
            char ch = arrowStr.charAt(i);
            if (ch == '*') {
                if (i + 1 >= arrowStr.length() || !Character.isDigit(arrowStr.charAt(i + 1)))
                    return new int[]{};
                int times = Character.getNumericValue(arrowStr.charAt(i + 1));
                for (int k = 0; k < times; k++) {
                    result.add(current);
                }
                i += 2;
                continue;
            }

            int next = transform(current, ch);
            if (next < 0) return new int[]{};

            current = next;
            result.add(current);
            i++;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int transform(int number, char ch) {
        int answer = 0;
        switch (ch) {
            case '↑': {
                if (number == 0) answer = 1;
                else if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5 || number == 6)
                    answer = number + 3;
                else if (number == 7 || number == 8 || number == 9) answer = -1;
                break;
            }
            case '→': {
                if (number == 1 || number == 4 || number == 7 || number == 2 || number == 5 || number == 8)
                    answer = number + 1;
                else if (number == 9 || number == 6 || number == 3 || number == 0) answer = -1;
                break;
            }
            case '↓': {
                if (number == 1) answer = 0;
                else if (number == 7 || number == 8 || number == 9 || number == 4 || number == 5 || number == 6)
                    answer = number - 3;
                else if (number == 2 || number == 3 || number == 0) answer = -1;
                break;
            }
            case '←': {
                if (number == 3 || number == 6 || number == 9 || number == 2 || number == 5 || number == 8)
                    answer = number - 1;
                else if (number == 0 || number == 1 || number == 4 || number == 7) answer = -1;
                break;
            }
        }
        return answer;
    }
}