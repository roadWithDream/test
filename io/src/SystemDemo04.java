import java.io.InputStream ;
public class SystemDemo04{
	public static void main(String args[]) throws Exception {	// �����쳣�׳�
		InputStream input = System.in ;	// �Ӽ��̽�������
		byte b[] = new byte[20] ;	// ���ٿռ䣬��������
		System.out.print("���������ݣ�") ;	// ��ʾ��Ϣ
		int len = input.read(b) ;	// ��������
		System.out.println("���������Ϊ��" + new String(b,0,len)) ;
		input.close() ;	// �ر�������
	}
};