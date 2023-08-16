package proj4;

/**
 * Multiply object implements Token and Operators interfaces.
 * Can be processed using its handle() method
 * Precedence: 2
 *
 * @author Zuhair AlMassri
 * @version 05/14/2023
 */
public class Multiply implements Operators{

    private final int PRECEDENCE = 2;


    /**
     * Get printable String of Operator
     * @return String as representation
     */
    public String toString() {
        return "*";
    }

    /**
     * The handle method processes the object.
     * pop and append to the postfix string every operator on the
     * stack until one of the following conditions occurs:
     * 1. Empty Stack
     * 2. Top of the stack is a left parenthesis (stays on the stack)
     * 3. Operator on top of the stack has a lower precedence than the current operator
     * Then, push the current operator onto the stack.
     *
     * @param s the Stack the token uses when being handled.
     * @return String to be added to output.
     */
    public String handle(Stack<Token> s)
    {
        String toReturn = "";
        Token topOfStack = s.peek();
        while(
                !s.isEmpty()
                        && !topOfStack.toString().equals("(")
                        && !(((Operators)topOfStack).getPrecedence() < this.getPrecedence())){
            toReturn += s.pop();
            topOfStack = s.peek();
        }
        s.push(this);
        return toReturn;
    }


    /**
     * Get the precedence of Operator
     * @return integer as precedence
     */
    public int getPrecedence(){
        return PRECEDENCE;
    }
}
