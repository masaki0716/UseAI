public class InputValidator {
    
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
    
    public boolean isValidOperator(String operator) {
        if (operator == null) {
            return false;
        }
        
        return operator.equals("+") || operator.equals("-") || 
               operator.equals("*") || operator.equals("/");
    }
}