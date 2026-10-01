import java.util.*;
class Queue{
	Scanner input = new Scanner(System.in);
	int rear;
	int front;
	int arr[];
	int size;
	Queue(){
		System.out.println("Enter the size of Queue: ");
		this.size=input.nextInt();
		arr=new int[size];
		rear=-1;
		front=-1;
	}
	void enQueue(int val){
		if(rear==size-1 && front == size-1){
			rear=-1;
			front=-1;
			rear++;
			arr[rear]=val;
			System.out.println("Element is inserted...");
 		}
		else if(rear==size-1){
			System.out.println("Queue is Overflow...");
		}
		else{
			rear++;
			arr[rear]=val;
			System.out.println("Element is inserted...");
		}

	}
	void deQueue(){
		if(front>rear){
			System.out.println("Queue is Underflow...");
		}
		else{
				if(front==-1){
					front=0;
				}
				
				int result=arr[front];
				System.out.println(result+" element is deleted...");
				front++;
		}

	}
	void Display(){

		if(front==size-1){
			System.out.println("Queue is Underflow...");
		}
		else{
			if(front==-1){
				front=0;
			}

			System.out.println("Element of Queue: ");
			int temp=front;
			for(int i=temp;i<=rear;i++){
				System.out.print(arr[i]+" ");
				//temp++;
			}
		}
	}
}

class QueueEx{
	public static void main(String[] args) {
		Queue obj=new Queue();

		Scanner input = new Scanner(System.in);
		while(true){

			System.out.println("\n 1.ENQUEUE \n 2.DEQUEUE \n 3.DISPLAY \n 4.EXIT");
			System.out.println("Enter your Choice ");
			int ch=input.nextInt();

			if(ch==1){
				int val;
				System.out.println("Enter the element: ");
				val=input.nextInt();
				obj.enQueue(val);
			}
			else if(ch==2){
				obj.deQueue();
			}
			else if(ch==3){
				obj.Display();
			}
			else if(ch==4){
				return;
			}
			else {
				System.out.println("Wrong choice...");
			}
		}
	}
}