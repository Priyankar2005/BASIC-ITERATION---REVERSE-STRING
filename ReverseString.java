public class ReverseString{
	public static void main(String[]args){
		String str="PRIYO";
		String rev="";
		int i = str.length()-1;
		while(i>=0){
			rev+=str.charAt(i);
			i--;
		}
		System.out.println("reversed string:"+rev);
	}
}

		