public class _6kyu_StringSubpatternRecognition_I {
    public static void main(String[] args) {
        System.out.println(hasSubpattern("a"));//false
        System.out.println(hasSubpattern("abcd"));//false
        System.out.println(hasSubpattern("ababababa"));//false
        System.out.println(hasSubpattern("123A123a123a"));//false
        System.out.println(hasSubpattern("abbabbabba"));//false
        System.out.println(hasSubpattern("abcdabcabcd"));//false
        System.out.println(hasSubpattern("abbaabbaabba"));//true (abba)
        System.out.println(hasSubpattern("aaaa"));//true
        System.out.println(hasSubpattern("abababab"));//true
        System.out.println(hasSubpattern("123a123a123a"));//true
    }
    public static boolean hasSubpattern(String str) {
    int len = str.length();
    for (int x=1; x<=len/2; x++){
      if(len % x != 0) continue;
      String part = str.substring(0,x);
      StringBuilder result = new StringBuilder();
      int len2 =len/x;
      for(int y=0; y<len2; y++) result.append(part);
      if (result.toString().equals(str)) return true;
    }
        return false;
    }
}