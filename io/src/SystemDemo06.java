import java.io.File ;
import java.io.FileOutputStream ;
import java.io.PrintStream ;
public class SystemDemo06{
	public static void main(String args[]) throws Exception {
		System.setOut(
			new PrintStream(
				new FileOutputStream("d:" + 
					File.separator + "red.txt"))) ;	// System.out����ض���
		System.out.print("www.mldnjava.cn") ;	// ���ʱ����������Ļ�����
		System.out.println("�����˻�") ;
	}
};