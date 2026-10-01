import java.util.*;
import java.lang.Math;
class FineNumber{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n,m,i;
		n=input.nextInt();
		m=input.nextInt();

		int a[]=new int[n];
		int b[]=new int[m];

		for(i=0;i<n;i++){

		}
		for(i=0;i<n;i++)
			{
				a[i]=input.nextInt();
			}
		for(i=0;i<m;i++)
			{
				b[i]=input.nextInt();
			}
			int res=Solution(n,m,a,b);
			System.out.println(res);
	}
	/*static int Solution(int n,int m, int a[],int b[]){
		int i,j,diff=0;
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				int temp=Math.abs(a[i]-b[j]);
				if(diff<temp){
					diff=temp;
				}
			}
		}
		return diff;
	}*/

	static int Solution(int n,int m, int a[],int b[]){
		Arrays.sort(a);
		Arrays.sort(b);
		return Math.abs(a[0]-b[m-1]);
	}
}