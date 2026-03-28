class Calculator{
	public void sum(int a,int b){
		System.out.println(a+b);
	}
	protected void display(){
		System.out.println("This is base class!!");
	}
	private void show(){
		System.out.println("This is private method!!");
	}
	public void accessPrivate(){
		show();
	}
}
class AdvancedCalculator extends Calculator{
	@Override
	public void sum(int a,int b){
		System.out.println(a*b);
	}
	@Override
	protected void display(){
		System.out.println("This is child class!!");
	}
	public void show(){
		System.out.println("This is public method!!");
	}
}
public class Calc{
	public static void main(String[] args){
		Calculator c=new Calculator();
		AdvancedCalculator ac=new AdvancedCalculator();
		Calculator c1=new AdvancedCalculator();
		c.sum(2,2);
		c.display();
		c.accessPrivate();
		ac.sum(3,2);
		ac.display();
		ac.show();
		c1.sum(3,2);
		c1.display();
	}
}