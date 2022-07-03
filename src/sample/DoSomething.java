
package sample;

public class DoSomething {

	@Test(a = 2, b = 5)
	public void addition(int a, int b) {
		System.out.println("Result is " + (a+b));
	}
	
	public void multiplication(int a, int b) {
		System.out.println("Result is " + (a*b));
	}

}