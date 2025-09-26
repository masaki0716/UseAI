public class CalculationService {
    private InputValidator validator;
    
    public CalculationService() {
        this.validator = new InputValidator();
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
    
    public InputValidator getValidator() {
        return validator;
    }
}

