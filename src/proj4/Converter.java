package proj4;

/**
 * A Converter Object that takes in a file path that stores inFix
 * expressions into postFix form
 *
 * @author Zuhair AlMassri
 * @version 05/14/2023
 */
public class Converter {
	FileReader inputFile;
	Stack<Token> tokenStack;
	private final String END_OF_FILE = "EOF";

	/**
	 * non-default constructor; Gradescope needs this to run tests
	 * @param infile path to the input file
	 */
    public Converter(String infile) {
		tokenStack = new Stack<>();
		inputFile = new FileReader(infile);
	}

	/**
	 * Converts expressions from inFix to postFix
	 * e.g A + B --> A B +
	 */
	public void convert() {
		String inFix = "";
		String postFix = "";
		String token = inputFile.nextToken();
		while (!isEndOfFile(token)) {
			if(!(token.equals(";"))){
				inFix += token;
			}
			switch (token) {
				case "(" : {
					Token leftParen = new LeftParen();
					postFix += leftParen.handle(tokenStack);
					break;

				}
				case ")" : {
					Token rightParen = new RightParen();
					postFix += rightParen.handle(tokenStack);
					break;

				}
				case "+" : {
					Token plus = new Plus();
					postFix += plus.handle(tokenStack);
					break;
				}
				case "-" : {
					Token minus = new Minus();
					postFix += minus.handle(tokenStack);
					break;
				}
				case "*" : {
					Token multiply = new Multiply();
					postFix += multiply.handle(tokenStack);
					break;

				}
				case "/" : {
					Token divide = new Divide();
					postFix += divide.handle(tokenStack);
					break;

				}
				case "^" : {
					Token exponent = new Exponent();
					postFix += exponent.handle(tokenStack);
					break;

				}
				case ";" : {
					Token semiColon = new Semicolon();
					postFix += semiColon.handle(tokenStack);
					printExpressions(inFix, postFix);
					inFix = "";
					postFix = "";
					break;
				}
				default : {
					postFix += token;
					break;
				}
			}
			token = inputFile.nextToken();
		}
	}

	/**
	 * Prints the inFix and outFix expressions in a presentable way
	 * @param inFix the String inFix expression
	 * @param postFix the String postFix expression
	 */
	private void printExpressions(String inFix, String postFix) {
		System.out.println(inFix + " --> " + postFix);
	}

	/**
	 * Checks whether the FileReader reached the end depending on the output given by reading the file
	 */
	private boolean isEndOfFile(String token){
		return token == END_OF_FILE;
	}



}

