class Calc{
	public void sum(int a,int b){
		System.out.println(a+b);
	}
	protected void sum(int a,int b,int c){
		System.out.println(a+b+c);
	}
	private void sum(double a,double b){
		System.out.println(a+b);
	}
	public void call(double a,double b){
		sum(a,b);
	}
}
public class Calculator{
	public static void main(String[] args){
		Calc c=new Calc();
		c.sum(2,2);
		c.sum(2,2,2);
		c.call(0.2,0.2);
	}
}