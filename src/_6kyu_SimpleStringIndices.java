public class _6kyu_SimpleStringIndices {
    public static void main(String[] args){
        System.out.println(solve("((1)23(45))(aB)",0));//10
        System.out.println(solve("((1)23(45))(aB)",1));//3
        System.out.println(solve("((1)23(45))(aB)",2));//-1
        System.out.println(solve("((1)23(45))(aB)",6));//9
        System.out.println(solve("((1)23(45))(aB)",11));//14
        System.out.println(solve("(g(At)IO(f)(tM(qk)YF(n)Nr(E)))",11));//28
        System.out.println(solve("(g(At)IO(f)(tM(qk)YF(n)Nr(E)))",0));//29
        System.out.println(solve("(>_(va)`?(h)C(as)(x(hD)P|(fg)))",19));//22
    }
    public static int solve(String str, int index){
        int x=0;
       for (int i=index;i<str.length();i++){
           if(str.charAt(index)!='(') return -1;
           else if (str.charAt(i)=='(') x++;
           else if(str.charAt(i)==')') {
               x--;
               if(x==0) return i;
           }
       }
        return -1;
    }
}
