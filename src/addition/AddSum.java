package addition;

import org.testng.annotations.Test;

public class AddSum {
	
	@Test
	public void basicAddition(){
		int a =10;
		int b=20;
		
		int c=a+b;
		System.out.println("The value of c = "+c);
	}
	
	@Test
	public void sumWithForLoop(){
		
		int a =30;
		int b =50;
		int c =a+b;
		System.out.println("Value of c = " + c);
	
		
		for(int i=0; i<10; i++ ){
			System.out.println("Helllo world "+ i);
	}

	}
}
