import java.io.OutputStream ;
import java.io.IOException ;
public class SystemDemo01{
	public static void main(String args[]){
		OutputStream out = System.out ;		// ��ʱ�������������Ļ�����
		try{
			out.write("hello world!!!".getBytes()) ;	// ����Ļ�����
		}catch(IOException e){
			e.printStackTrace() ;	// ��ӡ�쳣
		}
		try{
			out.close() ;	// �ر������
		}catch(IOException e){
			e.printStackTrace() ;
		}
	}
};