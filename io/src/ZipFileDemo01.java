import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.util.zip.ZipEntry ;
import java.util.zip.ZipOutputStream ;
import java.util.zip.ZipFile ;
import java.io.FileOutputStream ;
public class ZipFileDemo01{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		File file = new File("d:" + File.separator + "mldn.zip") ;	// �ҵ�ѹ���ļ�
		ZipFile zipFile = new ZipFile(file) ;	// ʵ����ZipFile����
		System.out.println("ѹ���ļ������ƣ�" + zipFile.getName()) ;	// �õ�ѹ���ļ�������
	}
};