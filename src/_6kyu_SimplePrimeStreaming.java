
public class _6kyu_SimplePrimeStreaming {
    public static void main(String[] arg){
    System.out.println(solve(20,9)); //"414347535"
//int x = 100;
//Integer boxed = x;
//System.out.println(boxed.getClass().getName());

    }
public static String solve(int a, int b){
    StringBuilder str = new StringBuilder();
    int i =2;
    int counter =0;
    while(counter<a+b){
        int k=0;
        for(int j=2;j<i;j++){
            if(i%j==0){
                k++;
            }
        }
        if(k<1){ str.append(i);
            counter++;}
        i++;
    }

    StringBuilder results = new StringBuilder();
    for(int j=a;j<b+a;j++){
        results.append(str.charAt(j));
    }
    return results+"";
}
}
