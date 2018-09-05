package holding;
import com.util.People;
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People f = new Children();
		f.testMethod();
		
		People p  = f;
		p.testMethod();
		p.testMethod();
		f.testMethod();
		
		System.out.println(5+4+"0");
	}

}
