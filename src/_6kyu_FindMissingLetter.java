import java.util.Arrays;

public class _6kyu_FindMissingLetter {
    public static void main(String[] args){
        System.out.println(findMissingLetter(new char[] { 'a','b','c','d','f' })); //e
        System.out.println(findMissingLetter(new char[] { 'O','Q','R','S' })); //P

    }
    public static char findMissingLetter(char[] array)    {
        for(int i =0; i<array.length; i++){
            if((int) array[i]+1 == (int) array[i+1]) continue;
                else return  (char) ((int )array[i]+1);
        }
        return ' ';
    }
}
