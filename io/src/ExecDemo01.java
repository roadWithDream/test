import java.io.* ;
public class ExecDemo01{
	public static void main(String args[]) throws Exception{
		int i = 0 ;
		int j = 0 ;
		BufferedReader buf = null ;		// ���ռ��̵���������
		buf = new BufferedReader(new InputStreamReader(System.in)) ;
		String str = null ;	// ��������
		System.out.print("�������һ�����֣�") ;
		str = buf.readLine() ;	// ��������
		i = Integer.parseInt(str) ;	// ���ַ�����Ϊ����
		System.out.print("������ڶ������֣�") ;
		str = buf.readLine() ;	// ��������
		j = Integer.parseInt(str) ;	// ����
		System.out.println(i + " + " + j + " = " + (i + j)) ;
	}
};