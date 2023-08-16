package proj4;
/**
 * A Client that uses the Converter Class provided with a file path that has inFix expressions to be
 * translated into postFix expressions and prints them out
 *
 * e.g. ((A+B)*(C-D)+E)/(F+G) --> AB+CD-*E+FG+/
 * 
 * @author Zuhair AlMassri
 * @version 05/15/2023
 */

public class Client
{
    public static void main(String[] args)
    {
        Converter ha = new Converter("C:/Users/Zuhai/OneDrive/Desktop/CSC 151/Project 4/src/proj4/proj4_input.txt");
        ha.convert();

    }
}
