import java.util.ArrayList;
import java.util.List;

public class _6kyu_ReversePolishNotationCalculator {
    public static void main(String[] args){
        System.out.println(evaluate("5 1 2 + 4 * + 3 -"));
        System.out.println(evaluate("5 1 2 + 4 * - 3 -"));
        System.out.println(evaluate(""));
        System.out.println(evaluate("1 3 +"));
        System.out.println(evaluate("3.5"));
    }
    public static double evaluate(String expr) {
        // TODO: Your awesome code here
        if(expr.isEmpty()) return  0;
        List<String> stack = new ArrayList<>();
        int result=0;
        for(String digit : expr.split(" ")){
            if (digit.equals("/")||digit.equals("*")||digit.equals("-")||digit.equals("+")){
            int first = Integer.parseInt(stack.get(stack.size()-2));
            int second = Integer.parseInt(stack.get(stack.size()-1));
            stack.remove(stack.size()-2);
            stack.removeLast();
            switch (digit){
                case "/" -> stack.add(first / second+"");
                case "-" -> stack.add(first - second+"");
                case "*" -> stack.add(first * second+"");
                case "+" -> stack.add(first + second+"");
            }
            }else{
                stack.add(digit);
            }
        }

        return  Double.parseDouble(stack.get(0));
    }
}
