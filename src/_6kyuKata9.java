public class _6kyuKata9 {
    public static void main(String[] args){
        System.out.println(solve(")()("));//2
        System.out.println(solve("((()"));//1
        System.out.println(solve("((("));//-1
        System.out.println(solve("())((("));//3
        System.out.println(solve("())()))))()()("));//4
    }
    public static int solve(String s){
        if(s.length()%2!=0) return -1;
        int balance = 0;
        int unmatch = 0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
               balance++;
           }else if(s.charAt(i)==')' &&  balance>0){
               balance--;
           }else {
               unmatch++;
           }
       }
       return balance+unmatch;
    }
}
