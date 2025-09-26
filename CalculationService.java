// 計算処理を行うサービスクラス
public class CalculationService {
    private InputValidator validator;
    
    // コンストラクタ
    public CalculationService() {
        this.validator = new InputValidator();
    }
    
    // 計算を実行するメソッド
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
    
    // 入力検証器を取得するメソッド
    public InputValidator getValidator() {
        return validator;
    }
    
    // 入力検証器を設定するメソッド
    public void setValidator(InputValidator validator) {
        this.validator = validator;
    }
}

