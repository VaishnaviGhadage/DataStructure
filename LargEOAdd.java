//Sum of Second Largest Even and Odd Position number Addition

import java.util.*;
class LargEOAdd{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int i;
		int arr[]=new int [n];

		for (i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
			int result=solution(arr,n);
			System.out.println(result);		 
	}
	static int solution(int arr[],int n){

		int maxE=0,maxO=0,i;

		for(i=0;i<n;i++)
		{
			if((i+1)%2==0){
				if(arr[i]>maxE)
				{
					maxE=arr[i];
				}
			}
		else
		{
			 
			if(arr[i]>maxO)
			{
				maxO=arr[i];
			}
		}
	}
	int sEven=0,sOdd=0;
		System.out.println("EVEN -> "+maxE);
		System.out.println("ODD -> "+maxO);
		int result;
		for(i=0;i<n;i++)
		{
			if((i+1)%2==0){
				if(arr[i]>sEven && arr[i]!=maxE)
				{
					sEven=maxE;
					maxE=arr[i];
				}
			}
		else
		{
			 
			if(arr[i]>sOdd && arr[i] != maxO)
			{
				sOdd=maxO;
				maxO=arr[i];
			}
		}
	}
		System.out.println("EVEN -> "+sEven);
		System.out.println("ODD -> "+sOdd);
		return sEven+sOdd;
	}

}