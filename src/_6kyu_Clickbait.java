
import java.util.Arrays;

public class _6kyu_Clickbait {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(shift(new char[][]{
                {'a', 'b', 'c', 'd'},
                {'1', '2', '3', '4'},
                {'c', 'o', 'd', 'e'},
                {'b', 'l', 'a', 'h'}}, 20)));
    }
        public static char[][] shift(char[][]m, int n){
        char [] result = new char[m.length * m[0].length];
        n = n % (m.length*m[0].length);
        int counter = 0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
        result[counter] =m[i][j];
        counter++;
            }
        }
        char [] partTwo=Arrays.copyOfRange(result, 0,result.length-n);
        char [] partOne =Arrays.copyOfRange(result, result.length-n, result.length);
        char[] merged = new char[partOne.length + partTwo.length];
        System.arraycopy(partOne, 0, merged, 0, partOne.length);
        System.arraycopy(partTwo, 0, merged, partOne.length, partTwo.length);

        char[][] output = new char [m.length][m[0].length];
        int index =0;
        for (int x  = 0 ; x<output.length; x++){
            for (int y  = 0 ; y<output[0].length; y++){
                output[x][y] = merged[index++];
            }
        }
        return output;
    }
}
