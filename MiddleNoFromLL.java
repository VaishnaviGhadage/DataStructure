// Find the middle elemrnt fron the Linked List
import java.util.Scanner;
class Node{
	int data;
	Node next;
	Node head;

	public Node(int data){
		this.data=data;
		next =null;
		head=null;
	}
	public void add(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			 Node temp=head;
			 while(temp.next!=null){
			 	temp=temp.next;
			 }
			 temp.next=newNode;
		}
	}
	public int findMiddleNode(int n){
		int mid=0,result=-1;
		if(n%2==0)
			mid=n/2;
		else 
			mid=(n+1)/2;
		int counter=1;
		Node temp=head;
		while(temp!=null){
			if(counter==mid){
				result=temp.data;
				break;
			}
			temp=temp.next;
			counter+=1;
		}
		return result;
	}
}

class MiddleNoFromLL{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt(),i, data;
		Node obj = new Node(input.nextInt());
		for(i=1;i<n;i++){
			obj.add(input.nextInt());
		}
		System.out.println(obj.findMiddleNode(n));
	}
}