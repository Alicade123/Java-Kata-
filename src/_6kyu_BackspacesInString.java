public class _6kyu_BackspacesInString {
    public void main(){
        System.out.println(cleanString("abc#d##c"));//ac
        System.out.println(cleanString("abc####d##c#"));//
    }
    public String cleanString(String s) {
        StringBuilder output = new StringBuilder();
        for(int i =0; i<s.length(); i++ ){
             if(s.charAt(i)=='#') {
             if( !output.isEmpty()) output.deleteCharAt(output.length()-1);
             else continue;
             }
             else output.append(s.charAt(i));
        }
        return output.toString();
    }
}
