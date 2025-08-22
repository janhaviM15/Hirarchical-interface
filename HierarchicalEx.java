package Inheritance;

class parent
{
	int a = 87;
	int b = 51;
	void display()
	{
		System.out.println("Parent class is exccuting");
	}
}
class Child1 extends Parent
{
	void add()
	{
		int sum = a+b;
		System.out.println("Addition of numbers is:" +sum);
	}
}
public class HierarchicalEx 
{
	void substract()
	{
		int sub = a-b;
		System.out.println("Substract of numbers is:" +sub);
	}

	public static void main(String[] args) 
	{
	  Child1 c1 = new Child1();
	  c1.add();
	  c1.display();
	  
	  HierarchicalEx c1 = new HierarchicalEx();
	  c1.substract();
	  c1.display();
	  
	}

}
