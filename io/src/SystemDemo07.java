import java.io.File ;
import java.io.FileOutputStream ;
import java.io.PrintStream ;
public class SystemDemo07{
	public static void main(String args[]){
		String str = "hello" ;		// ����һ�������ֵ��ַ���
		try{
			System.out.println(Integer.parseInt(str)) ;	// ת��
		}catch(Exception e){
			try{
				System.setOut(
					new PrintStream(
						new FileOutputStream("d:"
							+ File.separator + "err.log"))) ;	// ����ض���
			}catch(Exception e1){
			
			}
			System.out.println(e) ;
		}
	}
};