public class _8kyu_SumOfPositive {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
        System.out.println(sum(new int[]{}));
        System.out.println(sum(new int[]{-1,-2,-3,-4,-5}));
        System.out.println(sum(new int[]{-1,2,3,4,-5}));
    }
    public static int sum(int[] arr){
        int sum = 0;
       for(int num : arr){
           if(num > 0){
               sum += num;
           }
       }
        return sum;
    }

}
