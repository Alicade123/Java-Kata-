public class _6kyu_DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("din"));// (((
        System.out.println(encode("recede"));// ()()()
        System.out.println(encode("Success"));// )())())
        System.out.println(encode("(( @"));// ))(("
    }

    static String encode(String word) {
        StringBuilder result = new StringBuilder();
        word = word.toLowerCase();
        for (char c:word.toCharArray()){
            int k =0;
            for (int i=0; i<word.length();i++){
                if(word.charAt(i)==c) k++;
            }
            if(k>1) result.append(")");
            else result.append("(");
        }
        return result.toString();
    }
}
