package proj4;

/**
 * Describes the methods for an Object to be defined as an Operator.
 * The Object must have a value for its precedence (precedence())
 */
public interface Operators extends Token {
    /**
     * Returns the precedence of the operator as an integer
     * The larger the integer, the higher the precedence of an operator during an operation
     * @return int as precedence of this operator
     */
    public int getPrecedence();

}