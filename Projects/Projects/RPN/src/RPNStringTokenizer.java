import java.util.ArrayList;

public interface RPNStringTokenizer {
    public static ArrayList<String> tokenize(String expression) {
        // take a string.  If it is valid RPN stuff - integers or operators
        // - then put them in a list for processing.
        // anything bad (not int or one of the operators we like) and return a null.

        ArrayList<String> tokenList = new ArrayList<>();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                tokenList.add(token);
            } else {
                try {
                    Integer.valueOf(token);
                    tokenList.add(token);
                } catch (NumberFormatException e) {
                    return null;
                }
            }
        }
        return tokenList;
    }
}
