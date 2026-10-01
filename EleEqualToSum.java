import java.util.Scanner;

class EleEqualToSum{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int i;
		int arr[]=new int [n];

		for (i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		int sum=0,temp=0,flag=-1;
			for(i=0;i<n;i++)
			{
				sum += arr[i];
			}
			for(i=0;i<n;i++){
				temp=sum-arr[i];
				  if(temp==arr[i])
				  	System.out.println(arr[i]);
				  else
				  	System.out.println(flag);
			}
			
	}
}