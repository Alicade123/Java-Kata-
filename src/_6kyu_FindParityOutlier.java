public class _6kyu_FindParityOutlier {
    public static void main(String[] args){
        System.out.println(find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));//206847684
        System.out.println(find(new int[] {2, 6, 8, -10, 3})); //3
        System.out.println(find(new int[] {Integer.MAX_VALUE, 0, 1}));//0
        System.out.println(find(new int[] {2, 4, 0, 100, 4, 11, 2602, 36}));//11
        System.out.println(find(new int[] {160, 3, 1719, 19, 11, 13, -21}));//160

    }
    static int find(int[] integers) {
        String type = null;
        int first =integers[0];
        int second =integers[1];
        int third=integers[2];
        if(first%2 ==0 && second%2==0 || first%2 ==0 && third%2==0 ||second%2 ==0 && third%2==0) type = "even";
        else  type = "odd";
        if(type.equals("even")){
            for(int i = 0;i<integers.length; i++ ){
                if(integers[i]%2!=0) return integers[i];
            }
        }else {
            for(int i = 0;i<integers.length; i++ ){
                if(integers[i]%2==0) return integers[i];
            }
        }
        return 0;
    }
}
