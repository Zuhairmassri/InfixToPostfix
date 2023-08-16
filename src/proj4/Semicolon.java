package proj4;

/**
 * Write a description of class Semicolon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semicolon implements Token {

    public String toString(){
        return ";";
    }

    public String handle(Stack<Token> s){
        String toReturn = "";
        while(!s.isEmpty()){
            toReturn += s.pop();
        }
        return toReturn;
    }
	
}
