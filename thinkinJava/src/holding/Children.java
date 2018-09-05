package holding;

import com.util.Father;

public class Children extends Father {
	int i = 0;
	protected void sysOut(){
		i++;
		System.out.println("I am children");
		System.out.println(i);
	}
}
