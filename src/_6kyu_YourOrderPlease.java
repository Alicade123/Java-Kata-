public class _6kyu_YourOrderPlease {
    public static void main (String[] args){
        System.out.println(order("is2 Thi1s T4est 3a"));//Thi1s is2 3a T4est
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));//Fo1r the2 g3ood 4of th5e pe6ople
        System.out.println(order(""));
    }
    public static String order(String words) {
        if(words.isEmpty()) return  "";
        String[] wordsArray = words.split(" ");
        String[] result = new String[wordsArray.length];
        for(String word : wordsArray){
            for(char c : word.toCharArray()){
                if(Character.isDigit(c)) result[Integer.parseInt(c+"")-1] = word;
            }
        }

        return String.join(" ",result);
    }
}
