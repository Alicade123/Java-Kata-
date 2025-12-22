public class _7kyu_ReversingFun {
    public  static void main(){
        System.out.println(funReverse("0"));//0
        System.out.println(funReverse(""));//
        System.out.println(funReverse("012"));//201
        System.out.println(funReverse("012345"));//504132
        System.out.println(funReverse("0123456789"));//9081726354
        System.out.println(funReverse("Hello"));//oHlel");
        System.out.println(funReverse("012345"));//504132
        System.out.println(funReverse("4ppso1vdjc9rjyf5bkmd5nztr8"));//84rptpzsno51dvmdkjbc59fryj
    }
    public static String funReverse(String s) {
      for (int i = 0; i<s.length(); i++){
          StringBuilder preffix = new StringBuilder(s.substring(0,i));
          StringBuilder suffix = new StringBuilder(s.substring(i)).reverse();
          s = preffix+suffix.toString();
      }
      return s;
    }
}
