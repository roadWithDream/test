import java.io.FileInputStream ;
import java.io.InputStream ;
import java.io.File ;
public class SystemDemo09{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		System.setIn(new FileInputStream("d:"
			+ File.separator + "demo.txt")) ;	// ���������ض���
		InputStream input = System.in ;	// ���ļ��н�������
		byte b[] = new byte[1024]	;// ���ٿռ䣬��������
		int len = input.read(b) ;	//����
		System.out.println("���������Ϊ��" + new String(b,0,len)) ;
		input.close() ;	// �ر�������
	}
};