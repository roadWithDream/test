import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.io.OutputStream ;
import java.util.zip.ZipEntry ;
import java.util.zip.ZipOutputStream ;
import java.util.zip.ZipFile ;
import java.io.FileOutputStream ;
public class ZipFileDemo02{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		File file = new File("d:" + File.separator + "mldn.zip") ;	// �ҵ�ѹ���ļ�
		File outputFile = new File("d:" + File.separator + "mldn_unzip.txt") ; // �����ѹ�����ļ�����
		ZipFile zipFile = new ZipFile(file) ;	// ʵ����ZipFile����
		ZipEntry entry = zipFile.getEntry("mldn.txt") ;	// �õ�һ��ѹ��ʵ��
		OutputStream out = new FileOutputStream(outputFile) ; // ʵ���������
		InputStream input = zipFile.getInputStream(entry) ;	// �õ�һ��ѹ��ʵ���������
		int temp = 0 ;
		while((temp=input.read())!=-1){
			out.write(temp) ;
		}
		input.close() ;	// �ر�������
		out.close() ;	// �ر������
	}
};