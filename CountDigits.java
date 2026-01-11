public class CountDigits{
	public static void main(String[]args){
		int num =123455,count=0;
		while(num>0){
			num/=10;
			count++;
		}
		System.out.println("total digits:"+count);
	}
}
