package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int num,int den) {
		this.numerator = num;
		this.denominator = den;
		
	}
	public void add(Fraction r) {
		int den1 = this.denominator;
		int den2 = r.denominator;
		int num1 = this.numerator;
		int num2 = r.numerator;
		int commonDen=den1*den2;
		num1 = num1*den2;
		num2 = num2*den1;
		
		System.out.println (num1+num2 + "/" + commonDen);
	}
	public void multiply(Fraction r){
		int den1 = this.denominator;
		int den2 = r.denominator;
		int num1 = this.numerator;
		int num2 = r.numerator;
		System.out.println(num1*num2 + "/" + den1*den2);
	}
	public void divide(Fraction r) {
		int den1 = this.denominator;
		int num1 = this.numerator;	
		System.out.println(den1+"/"+num1);
	}
	public void simplify(Fraction r) {
		int den1 = this.denominator;
		int num1 = this.numerator;	
		
		int temp = den1;
		den1 = num1%den1;
		num1=temp; 
		
	}
			
	public int GCF(int num, int den) {
		int den1 = this.denominator;
		int num1 = this.numerator;	
		
		if(den1==0) {
			return 0;	
		}

		else {
			int temp = den1;
			den1 = num1%den1;
			num1=temp; 
			
			return GCF(num1,den1%num1);
	}
	}
}
