import java.io.OutputStream ;
import java.io.FileOutputStream ;
import java.io.File ;
public class CharSetDemo02{
	public static void main(String args[]) throws Exception {
		File f = new File("D:" + File.separator + "test.txt") ;	// ʵ����File��
		OutputStream out = new FileOutputStream(f) ;	// ʵ���������
		byte b[] = "�й�����ã�".getBytes("ISO8859-1") ;	// ת�����
		out.write(b) ;	// ����
		out.close() ;	// �ر�
	}
};