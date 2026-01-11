public class PowerCalculator{
	public static void main(String[]args){
		int base = 2,exp = 5,result = 1;
		while(exp>0){
			result*=base;
			exp--;
		}
		System.out.println("result="+result);
	}
}
