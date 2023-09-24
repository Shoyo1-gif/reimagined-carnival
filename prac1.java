public class prac1
{
	public static void main (String[] args)
	{
		int total = 2*3*4*5*6*7*8*9*10;
		System.out.println("A. multiplication of the first 10 positive integers :" + total);
		
		int b = total*11*12*13*14*15*16*17;
		System.out.println("B. multiplication of the first 17 positive integers :" + b);
		
		double x = 3.1;
		double y = 5;
		double z = 2/y + x * Math.sqrt(1/(9 + Math.pow(y,2)));
		System.out.println("C. Z = " + z);
		
		double a = 0.000000001;
		double d = (1/a)*a;
		System.out.println("D. = " + d);	
		
		
		
	}
}