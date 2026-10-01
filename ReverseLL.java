import java.util.Scanner;
class Node{
	int data;
	Node next;
	Node head;
	public Node(){
		head=null;
	}
	public Node(int data){
		this.data=data;
		next =null;
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
		//System.out.println("INSERTED ");
	}
	public void revLinkedList(int n){
 		Node temp=head, prevNode=null,nextNode=null;

 		System.out.print("value of head."+temp.data+"\n");

		while(temp!=null){
			nextNode=temp.next;
			temp.next=prevNode;
			prevNode=temp;
			temp=nextNode;
		}
		head=prevNode;	 
	}
	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
}
class ReverseLL{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt(),i,data;
		Node obj = new Node();

		for(i=0;i<n;i++){
			obj.add(input.nextInt());
		}
		obj.display();
		obj.revLinkedList(n);
		obj.display();
	}
}