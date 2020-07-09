/*  Define your own class with a static method "int digitCount(int n)" which should return the number of digits in a given input "n". 
Define your own functional interface to refer this static method and invoke it to get the number of digits.*/
package demoMethodReference;
interface I2{
	int digitCount(int n);
}
public class CountStaticMethod02 {
	public static int staticMetthod(int n) {
		int c=0;
		while(n>0) {
			c++;
			int r=n%10;
			n/=10;
		}
		return c;	
	}
	public static void main(String[] args) {
		I2 obj=CountStaticMethod02 ::staticMetthod;
		System.out.println(obj.digitCount(2345));

	}

}
