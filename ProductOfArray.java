import java.util.*;
class ProductOfArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int i,j;
		int arr[]=new int [n];

		for (i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		/*
		for (i=0;i<n;i++){
			int prod=1;
			for (j=0;j<n;j++){
				if(i==j)
					continue;
				else
					prod*=arr[j];
			}
			}
		*/
			int prod=1;
			for(i=0;i<n;i++)
			{
				prod*=arr[i];
			}

			for(i=0;i<n;i++){
				int temp=prod/arr[i];
				System.out.print(temp+" ");
			}

			//System.out.println(prod);
	}
}