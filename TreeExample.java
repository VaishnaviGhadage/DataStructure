import java.util.Scanner;
class Node{
	public int data;
	public Node left;
	public Node right;
	public Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
class TreeExp{
	public Node root;
	public TreeExp(){
		root=null;
	}
	public void insert(int data){
		root=insertNode(root,data);

	}
	public Node insertNode(Node current,int data){
		if(current==null){
			return new Node(data);
		}
		if(data < current.data){
			System.out.println("LEFT");
			current.left=insertNode(current.left,data);
		}
		else if(data > current.data){
			System.out.println("RIGHT");
			current.right=insertNode(current.right,data);
		}
		return current;
	}
	public void inOrder(){
		inOrderTrav(root);
		System.out.println();
	}
	public void inOrderTrav(Node current){
		if(current!=null){
			inOrderTrav(current.left);
			System.out.print(current.data + " ");
			inOrderTrav(current.right);
		}
	}
	public void preOrder(){
		preOrderTrav(root);
		System.out.println();
	}
	public void preOrderTrav(Node current){
		if(current!=null){
 			System.out.print(current.data +" ");
			preOrderTrav(current.left);
			preOrderTrav(current.right);
		}
	}
	public void postOrder(){
		postOrderTrav(root);
		System.out.println();
	}
	public void postOrderTrav(Node current){
		if(current!=null){
			postOrderTrav(current.left);
			postOrderTrav(current.right);
			System.out.print(current.data +" ");
		}
	}
	public boolean search(int data){
		if(searchNode(root,data)){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean searchNode(Node current , int data){
		boolean result =false;
		if(current==null){
			return false;
		}
		if(current.data==data){
			return true;
		}
		if(data < current.data){
			result=searchNode(current.left,data);
		}
		else if(data > current.data)
			result=searchNode(current.right,data);
		return result;
	}
}
class TreeExample{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TreeExp obj = new TreeExp();
 		while (true){
			System.out.println("\n 1.InsertNode\n 2.Inorder \n 0.EXIT \n 3.PreOrder \n 4.PostOrder \n 5.Search");
			System.out.println("Enter your choice: ");
			int ch=input.nextInt();
			if(ch==1)
				obj.insert(input.nextInt());
			else if(ch==2)
				System.out.println("IN order Tree...!!!");
				obj.inOrder();
			else if(ch==0)
				return;
			else if(ch==3){
				System.out.println("Pre order Tree...!!!");
				obj.preOrder();
			}
			else if(ch==4){
				System.out.println("Post order Tree...!!!");
				obj.postOrder();
			}
			else if(ch==5){
				boolean val = obj.search(input.nextInt());
				if(val==true)
					System.out.println("Element is found...!!!");
				else
					System.out.println("Element is not found...!!!");
			}
			else
				System.out.println("Wrong Choice...!!!");
		}
	}
}