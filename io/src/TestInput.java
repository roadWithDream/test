import java.io.* ;
import java.util.* ;
public class TestInput{
	public static void main(String args[]) throws Exception{
		InputData input = new InputData() ;
		// float f = input.getFloat("������С����","����Ĳ���С�������������룡") ;
		// System.out.println("С����" + f) ;
		Date d = input.getDate("���������ڣ���ʽΪ��yyyy-mm-dd����","��������ڸ�ʽ����ȷ������������") ;
		System.out.println("����" + d) ;
	}
};