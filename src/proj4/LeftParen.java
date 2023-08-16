package proj4;

/**
 * LeftParen object (for left parenthesis) implements Token interface
 * Can be processed using its handle() method
 * @author Zuhair AlMassri
 * @version 05/14/2023
 */
public class LeftParen implements Token{

    /**
     * prints the left parenthesis
     * @return returns String representation of LeftParen Object
     */
    public String toString(){
        return "(";
    }

    /**
     * Handles LeftParen Object. Pushes left parenthesis to Stack
     * @param s the Stack the token uses, if necessary, when processing itself.
     * @return empty String
     */
    public String handle(Stack<Token> s) {
        s.push(this);
        return "";
    }

}
