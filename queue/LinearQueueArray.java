import java.util.*;
class LinearQueue{
	int[] queue;
	int size, front, rear;
	
	LinearQueue(int size){
		this.size = size;
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	void enqueue(int value){
		if(rear == size - 1){
			System.out.println("Queue Overflow!");
			return;
		}
		if(front == -1){
			front = 0;
		}
		queue[++rear] = value;
		System.out.print(value + "Inserted");
	}
	
	void dequeue(){
		if(front == -1 || front > rear){
			System.out.println("Stack Underflow!");
			return;
		}
		System.out.println(queue[front] + " is removed from the queue");
		front++;
	}
	
	
	void peek(){
		if(front == -1 || front > rear){
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Front element: " + queue[front]);
	}
	void display(){
		if(front == -1 || front > rear){
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Queue:");
		for(int i = 0; i < size; i++){
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}
public class LinearQueueArray{
	public static void main(String[] args){
		LinearQueue q = new LinearQueue(4);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		q.display();
		
		q.enqueue(8);
		q.dequeue();
		
		q.display();
	}
}
