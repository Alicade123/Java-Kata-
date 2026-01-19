public class PhoneWords {
    public static void main(String[] args){
        System.out.println(phoneWords("443355555566604466690277733099966688"));
    }

    public static String phoneWords(String str) {
        // 416666663105558822255
        if(str.isEmpty()) return "";
        else{
        StringBuilder output = new StringBuilder();
        char firstCharacter = str.charAt(0);
        output.append(firstCharacter);
        StringBuilder  test = new StringBuilder(firstCharacter+"");
            for(int i =1 ; i<str.length(); i++){
                if(firstCharacter == str.charAt(i)){
                    test.append(str.charAt(i));
                }
                else{
                    output.append(validate(test));
                    test.setLength(0);
                    firstCharacter = str.charAt(i);
                    test.append(str.charAt(i));

                }
            }
            output.append(validate(test));
        return null;
    }
    }
    public static StringBuilder validate(StringBuilder test){
        char button = test.charAt(0);
        StringBuilder result = new StringBuilder();
        switch (button){

            case '1' -> {

            }
            case '2' -> {
               int counter = test.length();
               if (counter%3>=3) result.append('c');
               else if (counter%2>=2) result.append('b');


            }
            case '3' -> new StringBuilder("1");
            case '4' -> new StringBuilder("1");
            case '5' -> new StringBuilder("1");
            case '6' -> new StringBuilder("1");
            case '7' -> new StringBuilder("1");
            case '8' -> new StringBuilder("1");
            case '9' -> new StringBuilder("1");
            case '0' -> new StringBuilder("1");
        }
return  new StringBuilder();
    }
}
