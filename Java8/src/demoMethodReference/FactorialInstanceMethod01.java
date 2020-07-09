/* Define your own class with an instance method "int factorial(int n)" which should return the factorial of the given input "n". 
Define your own functional interface to refer this instance method and invoke it to get the factorial result.  */

package demoMethodReference;
@FunctionalInterface
interface I1{
	int factorial(int n);
}
public class FactorialInstanceMethod01 {
	public int instanceMethod(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		FactorialInstanceMethod01 obj=new FactorialInstanceMethod01();
		I1 obj1=obj::instanceMethod;
		System.out.println(obj1.factorial(5));
	}

}
