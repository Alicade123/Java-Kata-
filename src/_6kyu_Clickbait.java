import java.util.Arrays;

public class _6kyu_Clickbait {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(shift(new char[][]{{'a','b','c','d'},
                {'1','2','3','4'},
                {'c','o','d','e'},
                {'b','l','a','h'}}, 1)));
    }
    public static char[][] shift(char[][]m, int n){
        char [][] result = new char[m.length][m[0].length];
        int row = n%m.length;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){


            }
        }
        return result;

    }
}
