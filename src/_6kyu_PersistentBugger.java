public class _6kyu_PersistentBugger {
    public static void main (){
        System.out.println(persistence( 39));//3
        System.out.println(persistence( 4));//0
        System.out.println(persistence( 25));//2
        System.out.println(persistence( 999)); //4

    }
    public static int persistence(long n) {
    int count =0;
    String myNumber = String.valueOf(n);
    if(myNumber.length()==1) return count;
    else{
       while (myNumber.length()>1){
           count++;
           int multiplication = 1;
           for(int i =0; i< myNumber.length();i++) multiplication *= Integer.parseInt(myNumber.charAt(i)+"");
           myNumber = String.valueOf(multiplication);
       }
    }
        return count ;
    }
}
