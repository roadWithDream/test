public class SystemDemo03{
	public static void main(String args[]){
		String str = "hello" ;		// 声明一个非数字的字符串
		try{
			System.out.println(Integer.parseInt(str)) ;	// 转型
		}catch(Exception e){
			System.out.println(e) ;
		}
	}
};