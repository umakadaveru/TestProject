
public class Calculator {
	int n1=5;
	int n2=2;
	public void add()
	{
	   System.out.println("sum is" +(n1+n2));
	}
	public static void main(String args[])
	{
		Calculator cObj = new Calculator();
		cObj.add();
	}

}
