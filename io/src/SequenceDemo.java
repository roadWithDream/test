import java.io.File ;
import java.io.SequenceInputStream ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.io.FileOutputStream ;
import java.io.OutputStream ;
public class SequenceDemo{
	public static void main(String args[]) throws Exception {	// �����쳣�׳�
		InputStream is1 = null ;		// ������1
		InputStream is2 = null ;		// ������1
		OutputStream os = null ;		// �����
		SequenceInputStream sis = null ;	// �ϲ���
		is1 = new FileInputStream("d:" + File.separator + "a.txt") ;
		is2 = new FileInputStream("d:" + File.separator + "b.txt") ;
		os = new FileOutputStream("d:" + File.separator + "ab.txt") ;
		sis = new SequenceInputStream(is1,is2) ;	// ʵ�����ϲ���
		int temp = 0 ;	// ��������
		while((temp=sis.read())!=-1){	// ѭ�����
			os.write(temp) ;	// ��������
		}
		sis.close() ;	// �رպϲ���
		is1.close() ;	// �ر�������1`
		is2.close() ;	// �ر�������2
		os.close() ;	// �ر������
	}
};