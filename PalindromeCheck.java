public class PalindromeCheck{
	public static void main(String[]args){
		int num =120,temp = num,rev=0;
		while(num>0){
			rev=rev*10+num%10;
			num/=10;
		}
		if(rev==temp)
			System.out.println("Palindrome number");
		else
			System.out.println("not a palindrome");
	}
}
