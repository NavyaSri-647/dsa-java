import java.util.*;
class StackArray{
	int maxsize;
	int[] stack;
	int top;
	
	//constructor
	StackArray(int size){
		maxsize = size;
		stack = new int[maxsize];
		top = -1;
	}
	
	//push(int value)
	void push(int value){
		if(top == maxsize - 1){
			System.out.println("Stack Overflow!");
			return;
		}else{
			stack[++top] = value;
			System.out.println(value + " is pushed into the stack");
		}
	}
	
	//pop()
	int pop(){
		if(top == -1){
			System.out.println("Stack Underflow!");
			return -1;
		}
		return stack[top--];
	}
	
	//peek()
	int peek(){
		if(top == -1){
			System.out.println("Stack is empty");
			return -1;
		}
		return stack[top];
	}
	
	//isEmpty()
	boolean isEmpty(){
		return top == -1;
	}
	
	//display()
	void display(){
		if(top == -1){
			System.out.println("Stack is empty");
		}else{
			System.out.println("Stack Elements: ");
			for(int i = top; i >= 0; i--){
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}
}
public class Stack_Using_Arrays{
	public static void main(String[] args){
		StackArray s = new StackArray(5);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.display();
		System.out.println("After popping the element " +s.pop());
		System.out.println("Top most element: " +s.peek());
		s.display();
	}
}
