import java.util.*;

public class _6kyu_SimpleFun_135MissingAlphabets {
    public static void main() {
        System.out.println(find("abcdefghijklmnopqrstuvwxy"));//z
        System.out.println(find("abcdefghijklmnopqrstuvwxyz"));//
        System.out.println(find("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy"));//zz
        System.out.println(find("abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxy"));//ayzz
        System.out.println(find("codewars"));//bfghijklmnpqtuvxyz
        System.out.println(find("ceigyniotuh"));//aabbcddeffghjjkkllmmnoppqqrrsstuvvwwxxyzz
    }

    static String find(final String text) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : text.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        int times = counter.values()
                .stream()
                .max(Integer::compare)
                .orElse(0);

        StringBuilder result = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++) {
            int current = counter.getOrDefault(c, 0);
            int missing = times - current;

            for (int i = 0; i < missing; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }}