public class _4kyu_AddingBigNumbersManually {
    public static void main (String[] args){
        System.out.println(add("1" , "1"));//     2
        System.out.println(add("123" , "456"));//    579
        System.out.println(add("888" , "222"));//    1110
        System.out.println(add("1372", "69"));//    1441
        System.out.println(add("12"  , "456"));//    468
        System.out.println(add("100" , "101"));//    201
        System.out.println(add("0727782" , "3759"));//    731541 | 0731541
        System.out.println(add("63829983432984289347293874", "90938498237058927340892374089"));// 91002328220491911630239667963

    }
        public static String add(String a, String b) {
        StringBuilder aX = new StringBuilder(a).reverse();
        StringBuilder bX = new StringBuilder(b).reverse();
        StringBuilder result = new StringBuilder();
            int sum ;
            int carry=0;
            int aLength = a.length();
            int bLength = b.length();
            if(a.length()>b.length()){
                while (bLength<aLength){
                    bX.append("0");
                    bLength++;
                }
            }
                else if(a.length()<b.length()) {
                while (aLength<bLength){
                    aX.append("0");
                    aLength++;
                }
            }
            aX = aX.reverse();
            bX=bX.reverse();
        for(int i=aX.length()-1; i>=0;i--){
        sum = Integer.parseInt(aX.charAt(i)+"")+Integer.parseInt(bX.charAt(i)+"")+carry;
        if(sum>9){
            result.insert(0,String.valueOf(sum).charAt(1));
            carry = 1;
        }
        else {
            result.insert(0, sum);
            carry=0;
        }
        }
        if(carry==1) result.insert(0,carry);
       return Integer.parseInt(result.charAt(0)+"")>0 ? result.toString(): result.substring(1);
}
}
