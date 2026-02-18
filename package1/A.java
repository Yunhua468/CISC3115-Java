// package is a collection of classes, class is a collection of codes
package package1;
import package2.*;

public class A {
	protected String protectedmsg = "this is the protected modifier";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		//System.out.println(c.defaultmsg);  // default modifier could only be visited in the same package
		System.out.println(c.publicmsg);
		B b = new B();
		// System.out.println(b.privatemsg);  // private modifier could only be visited in the same package
	}

}
