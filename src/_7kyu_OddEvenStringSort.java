public class _7kyu_OddEvenStringSort {
    public static void main (String[] args){
        System.out.println(sortMyString("CodeWars"));
        System.out.println(sortMyString("Wleclgltihuebredrf ofsheesenasnegrof"));

    }
    public static String sortMyString(String s) {
        StringBuilder evenIndexedCharacters = new StringBuilder();
        StringBuilder oddIndexedCharacters = new StringBuilder();
        for (int i =0; i<s.length(); i++){
            if(i % 2 ==0)
                evenIndexedCharacters.append(s.charAt(i));
            else oddIndexedCharacters.append(s.charAt(i));
        }
        return evenIndexedCharacters +" "+oddIndexedCharacters;
    }
}
