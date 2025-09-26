// 入力値の検証を行うクラス
public class InputValidator {
    
    // 数値かどうかをチェックするメソッド
    public boolean isValidNumber(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        
        try {
            Double.parseDouble(input.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    // 演算子かどうかをチェックするメソッド
    public boolean isValidOperator(String operator) {
        if (operator == null) {
            return false;
        }
        
        return operator.equals("+") || operator.equals("-") || 
               operator.equals("*") || operator.equals("/");
    }
    
    // 入力値の検証結果を文字列で返すメソッド
    public String validateInputs(String[] args) {
        if (args.length < 3) {
            return "引数が不足しています。3つの引数が必要です。";
        }
        
        if (!isValidNumber(args[0])) {
            return "最初の引数が数値ではありません: " + args[0];
        }
        
        if (!isValidOperator(args[1])) {
            return "2番目の引数が正しい演算子ではありません: " + args[1];
        }
        
        if (!isValidNumber(args[2])) {
            return "3番目の引数が数値ではありません: " + args[2];
        }
        
        return null; // エラーなし
    }
}