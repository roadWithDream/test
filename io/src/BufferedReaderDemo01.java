import java.io.* ;
public class BufferedReaderDemo01{
	public static void main(String args[]){
		BufferedReader buf = null ;		// ��������
		buf = new BufferedReader(new InputStreamReader(System.in)) ;	// ���ֽ�����Ϊ�ַ���
		String str = null ;	// ������������
		System.out.print("���������ݣ�") ;
		try{
			str = buf.readLine() ;	// ��ȡһ������
		}catch(IOException e){
			e.printStackTrace() ;	// �����Ϣ
		}
		System.out.println("���������Ϊ��" + str) ;
	}
};