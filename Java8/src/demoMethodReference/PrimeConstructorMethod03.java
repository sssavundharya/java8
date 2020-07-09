/* Define your own class and a parameterized constructor with one integer argument. It should check the argument and display "Prime" or "Not Prime". 
Define your own functional interface to refer this constructor and invoke it to check whether the given number is Prime or Not.*/
package demoMethodReference;

interface I3{
	void prime(int n);
}
public class PrimeConstructorMethod03 {
	 PrimeConstructorMethod03(int n){
		 int count=0;
		 for(int i=2;i<=n/2;i++) {
			 if(n%i==0) {
				 count=1;
				 break;
			 }
		 }
		 if(count==0)System.out.println("prime");
		 else System.out.println("not prime");
	 }

	public static void main(String[] args) {
		I3 obj =PrimeConstructorMethod03::new;
		obj.prime(17);
	}

}
