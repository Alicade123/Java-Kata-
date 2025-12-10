import java.util.ArrayList;
import java.util.List;

public class _6kyu_MakeDeadfishSwim {
    public static void main(){
        System.out.println(parse("iiisdoso")); //new int[] {8, 64}
        System.out.println(parse("iiisdosodddddiso")); //new int[] {8, 64, 3600}

        //i: Increment the value
        //d: Decrement the value
        //s: Square the value
        //o: Output the value to a result array
    }
    public static int[] parse(String data) {
        List<Integer> result = new ArrayList<>();
        int value=0;
        for(char c : data.toCharArray()){
            if(c=='i') value++;
            else if(c=='d') value--;
            else if(c=='s') value =(int) Math.pow(value,2);
            else if(c=='o') result.add(value);
        }
        int [] finalResult = new int[result.size()];
        for(int i= 0; i<result.size();i++){
            finalResult[i] = result.get(i);
        }
        return  finalResult;
    }
}
