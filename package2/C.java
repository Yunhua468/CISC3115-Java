/*
		 * modifier     class    package   subclass    world
		 * public       Y        Y         Y           Y
		 * protected    Y        Y         Y           N
		 * private      Y        N         N           N
		 * no modifier  Y        Y         N           N
*/

package package2;
import package1.*;

public class C {
	       String defaultmsg = "This is the default";     // default modifier could be only visited in the same package
	public String publicmsg = "This is the public modifier";
	protected String protectedmsg = "This is the protected modifier";
	private String privatemsg = "This is the private modifier";
}
