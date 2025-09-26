public class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("使用方法: java Calculator <数値1> <演算子> <数値2>");
            return;
        }
        
        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);
            
            Calculator calc = new Calculator();
            double result = calc.calculate(num1, operator, num2);
            System.out.println("結果: " + result);
            
        } catch (NumberFormatException e) {
            System.out.println("エラー: 数値を入力してください");
        } catch (Exception e) {
            System.out.println("エラー: " + e.getMessage());
        }
    }
    
    public double calculate(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("ゼロで割ることはできません");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("サポートされていない演算子: " + operator);
        }
    }
}