import java.io.* ;
public class ExecDemo02{
	public static void main(String args[]) throws Exception{
		int i = 0 ;
		int j = 0 ;
		InputData input = new InputData() ;
		i = input.getInt("�������һ�����֣�","��������ݱ��������֣����������룡") ;
		j = input.getInt("������ڶ������֣�","��������ݱ��������֣����������룡") ;
		System.out.println(i + " + " + j + " = " + (i + j)) ;
	}
};