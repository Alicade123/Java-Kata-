import java.util.Arrays;

public class _6kyu_ArrayRotate {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},5)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},2)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},3)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},4)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},5)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},0)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},-1)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},-2)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},-3)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},-4)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},-5)));
        System.out.println(Arrays.toString(rotate(new int [] {1, 2, 3, 4, 5},600)));
    }
    public static int[] rotate(int[] data, int n) {
        n=n%data.length;

        if(n==0) {
            return data;
        }
        else if(n>0){
            int [] partOne = Arrays.copyOfRange(data, 0,data.length-n);
            int [] partTwo = Arrays.copyOfRange(data, data.length-n,data.length);
            int [] merged = new int[partOne.length +partTwo.length];
           System.arraycopy(partTwo,0,merged,0,partTwo.length);
           System.arraycopy(partOne,0,merged,partTwo.length, partOne.length);
            return merged;
        }
        else{
            n = n*(-1);
            int [] partOne = Arrays.copyOfRange(data, 0,n);
            int [] partTwo = Arrays.copyOfRange(data, n,data.length);
            int [] merged = new int[partOne.length +partTwo.length];
            System.arraycopy(partTwo,0,merged,0,partTwo.length);
            System.arraycopy(partOne,0,merged,partTwo.length, partOne.length);
            return merged;
        }



    }
}
