// Stack exaple
import java.util.*;
class Stack{
	Scanner input = new Scanner(System.in);
	private int arr[];
	private int top;
	private int size;

	Stack(){
		System.out.println("Enter the size of array: ");
		this.size=input.nextInt();
		top=-1;
		arr=new int[size];
	}
	public void PUSH(int val){
		if(top==size-1){
			System.out.println("Stack is Overflow");
		}
		else{
			top++;
			arr[top]=val;
			System.out.println("Element is inserted...");
		}

	}
	public int POP(){
		int result=-1;
		if(top==-1){
			System.out.println("Stack is Underflow...");
		}
		else{
			result=arr[top];
			top--;
			System.out.println("Element is popped...");
		}
		return result;
	}
	public void Print(){
		if(top==-1){
			System.out.println("Stsck is Empty");
		}
		else {
			System.out.println("Elements of Stack");
			for(int i=0;i<=top;i++){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
class StackEx{

	public static void main(String[] args) {
		Stack obj=new Stack();

		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("\n 1.PUSH \n 2.POP \n 3.Print \n 4.Exit");
			System.out.println("Enter your choice: ");
			int choice=input.nextInt();

			if(choice==1){
				int val;
				System.out.println("Enter the element ");
				val=input.nextInt();
				obj.PUSH(val);
			}
			else if(choice==2){
				int ele=obj.POP();
				System.out.println(ele);
			}
			else if(choice==3){
				obj.Print();
			}
			else if(choice==4){
				return;
			}
			else {
				System.out.println("Wrong Choice...");
			}
		}

	}
}