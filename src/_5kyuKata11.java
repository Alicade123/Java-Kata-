public class _5kyuKata11 {
    public static void main(String[] args) {
        System.out.println(rot13("okey"));

    }
    public static String rot13(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {
                result.append((char) ((letter - 'A' + 13) % 26 + 'A'));
            } else if (letter >= 'a' && letter <= 'z') {
                result.append((char) ((letter - 'a' + 13) % 26 + 'a'));
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }
}

