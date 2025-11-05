public class _6kyu_CamelCaseMethod {
    public static void main(String[] arg){
     System.out.println(camelCase("test case"));//TestCase
        System.out.println(camelCase("camel case method"));//CamelCaseMethod
        System.out.println(camelCase(" camel case word"));//CamelCaseWord
        System.out.println(camelCase("say hello "));//SayHello
        System.out.println(camelCase("z"));//Z
        System.out.println(camelCase("ab  c"));//AbC
        System.out.println(camelCase(""));//""



        }
    public static String camelCase(String str) {
        StringBuilder result = new StringBuilder();
        String[] myWords = str.trim().split(" ");
                for (String word : myWords) {
                    if (word.length() <1) { continue; }
                    else {
                        String n = word.substring(0, 1).toUpperCase() + word.substring(1);
                        result.append(n);
                    }
                }
                return result+"";

    }

}
