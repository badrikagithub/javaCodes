package plymorohism;

public class Calculator 
{
	private double operand1;
	private double operand2;
	//private double operand3;
	
	public Calculator(double operand1, double operand2) 
	{
	
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	public double add()
	{
		return operand1+operand2;
		
	}
	public double add(double operand3)
	{
		return operand1+operand2+operand3;
		
	}
	public double subtraction()
	{
		return operand1-operand2;
		
	}
	public double subtraction(double operand3)
	{
		return operand1-operand2-operand3;
		
	}
	public double multiply()
	{
		return operand1*operand2;
		
	}
	public double multiply(double operand3)
	{
		
		return operand1*operand2*operand3;
	}
	public double divide()
	{
		if(operand2==0)
		System.out.println("Throwing error :-arithmetic exception");
		return operand1/operand2;
	}
	public double divide(double operand3)
	{
		if(operand2==0 || operand3==0)
		System.out.println("Error:-Divison by zero");
		return (operand1/operand2)/operand3;	
	}

	public static void main(String[] args)
	{
		Calculator c=new Calculator(40.3,20);
		System.out.println("sum of two number="+c.add());
		System.out.println("sum of 3 numbers="+c.add(9.7));
		System.out.println("sub of 2 nums="+c.subtraction());
		System.out.println("sub of 3 nums="+c.subtraction(10));
		System.out.println("multiplication of 2 nums="+c.multiply());
		System.out.println("multiplication of 3 nums="+c.multiply(2));
		System.out.println("division of 2 nums="+c.divide());
		System.out.println("division of 3 nums="+c.divide(2));
		

	}

}
