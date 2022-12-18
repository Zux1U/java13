package homework.homework22;

public class Test {
    public static void main(String[] args) {
        System.out.println(Calculator.ExpressionRPN("(2+2)*2"));
        System.out.println(Calculator.RPNtoCalculate(Calculator.ExpressionRPN("(2+2)*2")));
    }
}
