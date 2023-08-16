package proj4;


/**
 * Stack ADT. Stores generic elements assigned when defining a Stack Object.
 * Stores elements based on LIFO (Last In First Out) basis
 * contents (LinkedList) where the head of the LinkedList is the top of the Stack (last element pushed to the Stack)
 * and the tail of the LinkedList is the (the oldest element pushed to the Stack)
 *
 * Author: Zuhair AlMassri
 * Version: 05/15/2023
 *
 * @param <T> Type of elements allowed to be stored in the Stack
 */
public class Stack<T>
{
    private LinkedList<T> contents;

    /**
     * A default Stack initialization. Assigns a LinkedList of specified type to contents
     */
    public Stack() {
       contents = new LinkedList<>();
    }

    /**
     * Checks whether the Stack is empty or not
     * @return true, iff Stack is empty. False, otherwise
     */
    public boolean isEmpty() {  
    	return size() == 0;
    }

    /**
     * Adds provided element to the top of the Stack
     * @param toPush Element to be pushed into the Stack
     */
    public void push(T toPush) {
       addToTop(toPush);
    }

    /**
     * Removes and Returns the last element pushed onto the Stack
     * @return Last Element pushed onto the Stack
     */
    public T pop() {
        return popAtIndex(0);
    }

    /**
     * Checks what the last element pushed onto the Stack was w/o modifying the Stack
     * @return returns the last element pushed onto the Stack
     */
    public T peek() {
    	return get(0);
    }

    /**
     * Checks the amount of elements stored in the Stack
     * @return the number of elements in Stack
     */
    public int size() {
    	return contents.getLength();
    }

    /**
     * Returns special String representation of the Stack
     * @return String representation of the Stack
     */
    public String toString() {
        String toReturn = "{>";
        for (int i = 0; i < size(); i++) {
            toReturn += get(i);
            if (i != size() - 1) {
                toReturn += ", ";
            }
        }
        return toReturn + "}";
    }

    /**
     * Returns the element stored in the Stack at a specific index
     * @param index index of the wanted element in the Stack
     * @return the wanted element in the Stack
     */
    private T get(int index){
        return contents.get(index);
    }

    /**
     * Insert an Element to the top of the Stack
     * @param toAdd Element to be inserted
     */
    private void addToTop(T toAdd){
        contents.insertAtHead(toAdd);
    }

    /**
     * Removes and Returns an element at a given index from the Stack
     * @param index index of the element to be popped
     * @return returns the popped element
     */
    private T popAtIndex(int index){
        T toPop = contents.get(index);
        contents.removeAtIndex(index);
        return toPop;
    }


    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        myStack.push(0);
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
    }
    
} 
   

