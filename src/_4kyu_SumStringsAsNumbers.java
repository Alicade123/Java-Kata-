public class _4kyu_SumStringsAsNumbers {
    public static void main() {
        System.out.println(sumStrings("123", "456"));//579
        System.out.println(sumStrings("800", "9567"));//10367
        System.out.println(sumStrings("00103", "08567"));//8670

    }

    public static String sumStrings(String a, String b) {
        StringBuilder bb = new StringBuilder(b);
        StringBuilder aa = new StringBuilder(a);
        if (a.length() > b.length()) {
            int i = bb.length();
            while (a.length() > i) {
                bb.insert(0, "0");
                i++;
            }
        } else if (b.length() > a.length()) {
            int j = aa.length();
            while (b.length() > j) {
                aa.insert(0, "0");
                j++;
            }
        }
        int carry =0;
        StringBuilder result = new StringBuilder();
        for (int x = aa.length()-1; x >= 0; x--) {
        int sum = Integer.parseInt(aa.charAt(x)+"")+Integer.parseInt(bb.charAt(x)+"")+carry;
        if(sum>9) {
            result.append(String.valueOf(sum).charAt(1));
            carry=1;
        }else{
            result.append(sum);
            carry=0;
        }
        }
        if(carry==1) result.append(carry);
        result  = result.reverse();
        return result.charAt(0)!='0' ? result.toString():result.substring(1);
    }
}
