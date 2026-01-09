public class _6kyu_KeypadPhoneMessageWriting {
    static void main() {
        System.out.println(presses("LOL"));//9
        System.out.println(presses("HOW R U"));//13
        System.out.println(presses("WHERE DO U WANT 2 MEET L8R"));//47
    }
    public static int presses(String phrase) {
        String phraseNormalized = phrase.replaceAll("[^0-9A-Za-z*# ]","").toLowerCase();
       int counter = 0;
        for(int i=0; i<phraseNormalized.length();i++){
           counter += count(phraseNormalized.charAt(i));
       }
        return counter;
    }
    public static int count(char c){
        int v = 0;
        switch (c){
            case '1','a','d','g','j','m','p','t','w','*','#',' ' -> v=1;
            case 'b','e','h','k','n','q','u','x','0' -> v=2;
            case 'c','f','i','l','o','r','v','y' -> v=3;
            case '2','3','4','5','6','s','8','z' -> v=4;
            case '7','9' -> v=5;
        }
        return v;
    }
}
