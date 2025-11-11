import java.util.Arrays;

public class _6kyu_MultiplicationTable {
    public static void main(String[] args) {
System.out.println(Arrays.deepToString(multiplicationTable(1)));
System.out.println(Arrays.deepToString(multiplicationTable(3)));
    }
    public static int [][] multiplicationTable(int n){

       int [][] results = new int [n][n];
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               results[i-1][j-1]=i*j;
           }
       }
       return results;
    }
}
