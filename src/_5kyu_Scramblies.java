public class _5kyu_Scramblies {
    public static void main (String[] arg){

        System.out.println(scramble("rkqodlw","world"));// true
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));//true
        System.out.println(scramble("katas","steak"));//false
        System.out.println(scramble("scriptjavx","javascript"));//false
        System.out.println(scramble("scriptingjava","javascript"));//true
        System.out.println(scramble("scriptsjava","javascripts"));//true
        System.out.println(scramble("javscripts","javascript"));//false
        System.out.println(scramble("aabbcamaomsccdd","commas"));//true
        System.out.println(scramble("commas","commas"));//true
        System.out.println(scramble("sammoc","commas"));//true
    }
    public static boolean scramble(String str1, String str2) {
        StringBuilder str = new StringBuilder(str1);
        StringBuilder txt = new StringBuilder();

        for(char c: str2.toCharArray()){
            if(!str.toString().contains(c+"")) return false;
            else {
                txt.append(c);
                str.deleteCharAt(str.indexOf(c+""));
            }
        }
        return txt.toString().equals(str2);
    }
}
