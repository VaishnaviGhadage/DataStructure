import java.util.*;
class LostInForest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m=input.nextInt();
		System.out.println(Solution(m));
	}
	static int Solution(int m){
		int length=0,result=0;
		for(int i=1;i<=m;i++)
		{
			int temp=i;
			int len=0;
			System.out.println(temp);
			while(temp!=1){
				if(temp%2==0)
					temp/=2;
				else
					temp=(3*temp)+1;
				len++;

				if(len>length){
					length=len;
					result=i;
				}
			}
		}
		return result;
	}
}