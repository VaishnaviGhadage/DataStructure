import java.util.*;
class PalindNoArr{

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
			int result1=solution2(arr,n);
			System.out.println(result1);
	}
		static int solution(int arr[],int n){
			int max=arr[0];
			int result=-1;
			for (int i=0;i<n;i++){
				if(arr[i]>max){
					max=arr[i];
					String temp1=Integer.toString(max);
					StringBuilder temp2= new StringBuilder(temp1);
					temp2.reverse();
					if(temp1.equals(temp2.toString())){
						result=arr[i];
					}
				}
			}
			return result;
		}
		static int solution2(int arr[],int n){
			int min=arr[0];
			int result=0;
			for (int i=0;i<n;i++){
				if(arr[i]<min){
					min=arr[i];
					String temp1=Integer.toString(min);
					StringBuilder temp2= new StringBuilder(temp1);
					temp2.reverse();
					if(temp1.equals(temp2.toString())){
						result=arr[i];
					}
				}
				else 
					result=min;
			}
			return result;
		}

}