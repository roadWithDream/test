import java.util.* ;
public class ScannerDemo01{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in) ;	// �Ӽ��̽�������
		System.out.print("�������ݣ�") ;
		String str = scan.next() ;	// ��������
		System.out.println("���������Ϊ��" + str) ;
	}
};