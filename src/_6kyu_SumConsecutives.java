import java.util.*;
public class _6kyu_SumConsecutives {
    public static void main(String[] args) {
        System.out.println(sumConsecutives(Arrays.asList(1,4,4,4,0,4,3,3,1)));
    }

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> res = new ArrayList<>();
        int currentSum = s.get(0);

        for (int i = 1; i < s.size(); i++) {
            if (s.get(i).equals(s.get(i - 1))) {
                currentSum += s.get(i);
            } else {
                res.add(currentSum);
                currentSum = s.get(i);
            }
        }
        res.add(currentSum);

        return res;
    }
}