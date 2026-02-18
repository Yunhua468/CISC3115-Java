import java.util.ArrayList;

public class classquestiontest {

	public static void main(String[] args) {
		SimpleGeometricObject x = new CircleFromSimpleGeometricObject(3);
		SimpleGeometricObject y = x.clone();
		 System.out.println(x == y);
	}

}

