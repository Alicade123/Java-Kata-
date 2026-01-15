import java.util.Arrays;

public class _6kyu_MineFinder {
    public static void main(String[] args){
        System.out.println(Arrays.toString(findMine( new int[][] { {1, 0}, {0, 0} } )));//new int[] {0,0}
        System.out.println(Arrays.toString(findMine( new int[][] { {1, 0, 0}, {0, 0, 0}, {0, 0, 0} } )));//new int[] {0,0}
        System.out.println(Arrays.toString(findMine( new int[][] { {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0} } )));//new int[] {2,2}
    }
    public static int[] findMine(int[][] field){
        for(int i=0; i<field.length;i++){
            for (int j=0; j<field[i].length;j++){
                if(field[i][j]==1) return new int[]{i,j};
            }
        }
        return new int[] {};
    }

}
