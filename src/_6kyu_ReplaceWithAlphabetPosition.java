public class _6kyu_ReplaceWithAlphabetPosition {
    public static void main (String[] args){
        System.out.println(alphabetPosition("The sunset sets at twelve o' clock."));//"20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"
        System.out.println(alphabetPosition("The narwhal bacons at midnight."));//("20 8 5 14 1 18 23 8 1 12 2 1 3 15 14 19 1 20 13 9 4 14 9 7 8 20",
        //alphabetPosition("The sunset sets at twelve o' clock.");
    }
    static String alphabetPosition(String text) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<text.length(); i++){
            if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
              result.append((int) text.charAt(i) - 64);
                if(i < text.length()-1 && Character.toString(text.charAt(i)).matches("[a-zA-Z]")) result.append(" ");
           }
           else if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
               result.append((int) text.charAt(i)-96);
               if(i < text.length()-1 && Character.toString(text.charAt(i)).matches("[a-zA-Z]")) result.append(" ");
           }
        }
        return result.toString();
    }
}
