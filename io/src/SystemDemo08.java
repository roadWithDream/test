import java.io.ByteArrayOutputStream ;
import java.io.PrintStream ;
public class SystemDemo08{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		ByteArrayOutputStream bos = null ;		// �����ڴ������
		bos = new ByteArrayOutputStream() ;		// ʵ����
		System.setErr(new PrintStream(bos)) ;	// ����ض���
		System.err.print("www.mldnjava.cn") ;	// �����������������Ļ�����
		System.err.println("���˻�") ;			// ���ڴ������
		System.out.println(bos) ;	// ����ڴ��е�����
	}
};