class String1 {
	String qq = "";

	int j = 1;
	int i = j;
	
	public void play() {
		System.out.println("jilei");
		
	}
	
}

class String2 extends String1 {
	@Override
	public void play() {
		_play();
	}
	public void _play() {
		System.out.println("¡ª¡ªzilei");
	}
}
public class TestString{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String1 s = new String2();
		s.play();
		//System.out.println(s.qq);

	}

}
