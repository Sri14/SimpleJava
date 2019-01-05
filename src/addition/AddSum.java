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

}
