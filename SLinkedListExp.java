import java.util.*;
class Node{
	int data;
	Node next;

	public Node(int data){
		this.data=data;
		next =null;
	}
}
class SinglyLinkedList{
	private Node head;
	public SinglyLinkedList(){
		head=null;
	}

	void insertAtStart(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			newNode.next=head;
			head=newNode;
		}
		System.out.println("Element inserted...!!!");
	}
	void  insertAtEnd(int data){
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
	void insertAtMiddle(int data,int existNode){

	}
	void display(){
		Node temp=head;
		if(head==null){
			System.out.println("Linked List is Empty...!!!");
		}
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	// Deletion Operation

	void deleteAtStart(){
		if(head==null){
			System.out.println("List is Empty...!!!");
			return;
		}
		Node temp=head;
		head=temp.next;
		temp.next=null;
		temp=null;
		System.out.println("Node is Deleted...!!!");

	}
	void deleteAtEnd(){
		if(head==null){
			System.out.println("List is Empty...!!!");
			return;
		}
		Node temp=head,prev=head;
		while(temp.next!=null){
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		temp=null;
		System.out.println("Node is Deleted...!!!");		
	}
	void deleteAtMiddle(int nodetoDel){
		if(head==null){
			System.out.println("List is Empty...!!!");
			return;
		}
		boolean flag=false;
		Node temp=head;
		Node preNode=head,nextNode=head;

		while(temp.next!=null){
			if(temp.data==nodetoDel){
				flag=true;
			}
			preNode=temp;
			temp=temp.next;
		}
		if(flag==false){
			System.out.println("node not found...!!!");
				
		}
		else{
			preNode.next=temp.next;
			temp=null;
			System.out.println("Node is deleted...!!!");
		}
	}
} 
public class SLinkedListExp{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		SinglyLinkedList obj=new SinglyLinkedList();
		while(true){
			System.out.println("\n 1. InsertAtStart \n 2. InsertAtMiddle \n 3. InsertAtEnd \n 4. Display \n 5. Exit");
			System.out.println("6. DeleteAtStart \n 7. DeleteAtEnd \n 8. DeleteAtMiddle");
			System.out.println("Enter the Choice: ");
			int ch=input.nextInt();
			if(ch==1){
				System.out.println("Enter the node: ");
				int data=input.nextInt();
				obj.insertAtStart(data);
			}
			else if(ch==2){
				System.out.println("Enter the node: ");
				int data=input.nextInt();
				System.out.println("Enter the existNode: ");
				int existNode=input.nextInt();
				obj.insertAtMiddle(data , existNode);
			}
			else if(ch==3){
				System.out.println("Enter the node: ");
				int data=input.nextInt();
				obj.insertAtEnd(data);
			}
			else if(ch==4){
				obj.display();
			}
			else if(ch==5){
				return;
			}
			else if(ch==6){
				obj.deleteAtStart();
			}
			else if(ch==7){
				obj.deleteAtEnd();
			}
			else if(ch==8){
				System.out.println("Enter the node to delete: ");
				int nodetoDel=input.nextInt();
				obj.deleteAtMiddle(nodetoDel);
			}
		}
	}
} 