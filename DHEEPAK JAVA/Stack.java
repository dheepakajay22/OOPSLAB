import java.util.*;
public class Stack<E>{
    private List<E> stack = new ArrayList<>();

    void push(E element){
        stack.add(element);
    }
    E pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            throw new EmptyStackException();
        }
        else{
        E el = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return el;
        }
    }
    Boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    E peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            throw new EmptyStackException();
        }
        else{
        return stack.get(stack.size()-1);
        }
    }
    public static void main(String args[]){
        Stack<String> test = new Stack<>();
        test.push("1");
        System.out.println("Element at head:"+test.peek());
        String element = test.pop();
        System.out.println("Popped element:"+element);
        test.pop();
    }
}