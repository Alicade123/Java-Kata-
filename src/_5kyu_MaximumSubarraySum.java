public class _5kyu_MaximumSubarraySum {
    public static void main(){
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
        public static int sequence(int[] arr) {
            if(arr == null || arr.length == 0) return 0;
            int result =0;
            for(int i=0; i<arr.length; i++){
                int currentSum =0;
                for(int j=i; j<arr.length; j++){
                    currentSum+=arr[j];
                    result = Math.max(result, currentSum);
                }
            }
            return result;
        }

}
