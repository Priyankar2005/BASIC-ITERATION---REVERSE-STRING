public class Factorial{
	public static void main(String[]args){
		int num=6;
		long fact = 1;
		int i =1;
		while(i<=num){
			fact*=i;
			i++;
		}
		System.out.println("factorial of"+num+"="+fact);
	}
}
