package proj4;

/**
 * RightParen object (for right parenthesis) implements Token interface
 * Can be processed using its handle() method
 *
 * @author Zuhair AlMassri
 * @version 05/14/2023
 */
public class RightParen implements Token{

    /**
     * prints the right parenthesis
     * @return returns String representation of RightParen Object
     */
    public String toString(){
        return ")";
    }

    /**
     * Append to the postfix string all operators on the stack down to the most
     * recently scanned left parenthesis. Then discard this pair of parentheses.
     * @param s the Stack the token uses, if necessary, when processing itself.
     * @return String with postfix operators to be added to output
     */
    public String handle(Stack<Token> s) {
        String toReturn = "";
        while (!s.isEmpty() &&
                !s.peek().toString().equals("(")){
            toReturn += s.pop();
        }
        s.pop();
        return toReturn;
    }
}
