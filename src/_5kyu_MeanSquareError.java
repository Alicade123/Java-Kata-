public class _5kyu_MeanSquareError {
    public static void main (String[] args){
        System.out.println(solution( new int[] {1, 2, 3}, new int[] {4, 5, 6} )); //9.0
        System.out.println(solution( new int[] {10, 20, 10, 2}, new int[] {10, 25, 5, -2} ));//16.5
        System.out.println(solution( new int[] {0, -1}, new int[] {-1, 0} ));//1.0
        System.out.println(solution( new int[] {10, 10}, new int[] {10, 10} ));//0.0
    }
    public static double solution(int[] arr1, int[] arr2) {
        double sum=0.0;
        for(int i=0; i<arr1.length; i++){
            int x = arr1[i]-arr2[i];
             sum += Math.pow(x,2);
        }
        return sum/arr1.length;
    }
}
