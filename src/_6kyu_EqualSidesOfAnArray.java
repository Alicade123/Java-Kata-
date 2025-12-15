public class _6kyu_EqualSidesOfAnArray {
    public static void main(String[] args){
        System.out.println(findEvenIndex(new int[] {1,2,3,4,3,2,1})); //3
//        System.out.println(findEvenIndex(new int[] {1,100,50,-51,1,1}));//1
        System.out.println(findEvenIndex(new int[] {1,2,3,4,5,6}));//-1
//        System.out.println(findEvenIndex(new int[] {20,10,30,10,10,15,35}));//3
        System.out.println(findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));//-1
//        System.out.println(findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));//1
        System.out.println(findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));//6

    }
    public static int findEvenIndex(int[] arr) {
       int counter = 0;
       while(counter<arr.length){
           int x=0;
           int y =0;
       for (int i =0; i<arr.length; i++){
           if(i<counter) x+=arr[i];
           else if(i>counter) y+=arr[i];

       }
        if(x==y) return counter;
        counter++;
       }
       return -1;
    }
}
