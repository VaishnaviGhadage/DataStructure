import java.util.*;
import java.lang.Math;
class PalinSub{

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
			int maxeven=arr[0],maxodd=arr[0];
			int result=0,result1=0;

			for (int i=0;i<n;i++){
				if(arr[i]%2==0){
				if(arr[i]>maxeven){
					maxeven=arr[i];
					String temp1=Integer.toString(maxeven);
					StringBuilder temp2= new StringBuilder(temp1);
					temp2.reverse();
					if(temp1.equals(temp2.toString())){
						result=arr[i];
					}
				}
			}
			else 
				{
					if(arr[i]>maxodd){
						maxodd=arr[i];
						String temp1=Integer.toString(maxodd);
						StringBuilder temp2= new StringBuilder(temp1);
						temp2.reverse();
						if(temp1.equals(temp2.toString())){
							result1=arr[i];
						}
					}
				}

			}
			return Math.abs(maxeven-maxodd);
		}
}