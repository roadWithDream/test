import java.io.InputStream ;
public class SystemDemo05{
	public static void main(String args[]) throws Exception {	// �����쳣�׳�
		InputStream input = System.in ;	// �Ӽ��̽�������
		StringBuffer buf = new StringBuffer() ;	// ʹ��StringBuffer��������
		System.out.print("���������ݣ�") ;	// ��ʾ��Ϣ
		int temp = 0 ;		// ��������
		while((temp=input.read())!=-1){
			char c = (char) temp ;	// �����ݱ�Ϊ�ַ�
			if(c=='\n'){	// �˳�ѭ��������س���ʾ�������
				break ;
			}
		}
		System.out.println("���������Ϊ��" + buf) ;
		input.close() ;	// �ر�������
	}
};