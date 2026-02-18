
public class midterm1_2023fall {
	int p;
    public midterm1_2023fall() {
    this(0);
    System.out.println("P3");
    }
    public midterm1_2023fall(int p) {
    this.p = p;
    }
    public void setP(int p) {
    this.p = p;
    }
    
        public static void main(String[] args)
        {   
        	midterm1_2023fall o = new midterm1_2023fall();
        	System.out.println(o.p);
        	//System.out.println(f(4,2));
        	//System.out.println(f("567"));
        }

        static int f(int x, int y)
        {   return x > y ? x : y;
        }
        
        public static int f(String s) {
        	int n = s.length();
        	if (n == 0)
        	return 0;
        	else
        	return f(s.substring(0, n-1)) + (s.charAt(n-1) - '0');
        }
        
        
        
        	
        


}
