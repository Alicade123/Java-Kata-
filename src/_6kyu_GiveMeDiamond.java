public class _6kyu_GiveMeDiamond {
    public static void main(){
        System.out.println(check(-20));
        System.out.println(check(4));
        System.out.println(check(5));

    }
    public static String check(int x){
        if(x<=0 || x%2==0) return null;
        StringBuilder result = new StringBuilder();
        int mid = x/2;
          for(int i=0; i<x;i++){
              int stars = i <= mid ? (2 * i + 1) : (2 * (x - i - 1) + 1);
              int spaces = (x - stars) / 2;

              result.append(" ".repeat(spaces));
              result.append("*".repeat(stars));
              result.append("\n");
          }
          return result.toString();

    }
}
