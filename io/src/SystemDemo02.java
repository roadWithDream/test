public class SystemDemo02{
	public static void main(String args[]){
		String str = "hello" ;		// ����һ�������ֵ��ַ���
		try{
			System.out.println(Integer.parseInt(str)) ;	// ת��
		}catch(Exception e){
			System.err.println(e) ;
		}
	}
};