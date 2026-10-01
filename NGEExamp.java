import java.util.*;
class NGEExamp{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=input.nextInt(),i,j,temp=-1;
		int arr[]=new int[size];
		for(i=0;i<size;i++){
			arr[i]=input.nextInt();
		}

		for(i=0;i<size;i++){
			for(j=i;j<size;j++){
				if(i==size-1){
					System.out.println(arr[i]+" -> "+"-1");
					break;
				}
				else if(arr[i]<arr[j]){
					System.out.println(arr[i]+" -> "+arr[j]);
					break;
				}
				else if(arr[i]>arr[j]){
					System.out.println(arr[i]+" -> "+temp);
					break;
				} 
			}
			
		}
	}
}