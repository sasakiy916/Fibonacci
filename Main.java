public class Main{
	public static void main(String[] args){
		int preNum = 0;
		int nextNum = 1;
		int sum;
		for(int i=1;i<=30;i++){
			System.out.print(nextNum + ",");
			sum = preNum + nextNum;
			preNum = nextNum;
			nextNum = sum;
			if(i%5==0){
				System.out.println();
			}
		}
	}
}
