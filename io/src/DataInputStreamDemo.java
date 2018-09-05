import java.io.DataInputStream ;
import java.io.File ;
import java.io.FileInputStream ;
public class DataInputStreamDemo{
	public static void main(String args[]) throws Exception{	// �����쳣�׳�
		DataInputStream dis = null ;		// ������������������
		File f = new File("d:" + File.separator + "order.txt") ; // �ļ��ı���·��
		dis = new DataInputStream(new FileInputStream(f)) ;	// ʵ������������������
		String name = null ;	// ��������
		float price = 0.0f ;	// ���ռ۸�
		int num = 0 ;	// ��������
		char temp[] = null ;	// ������Ʒ����
		int len = 0 ;	// �����ȡ���ݵĸ���
		char c = 0 ;	// '\u0000'
		try{
			while(true){
				temp = new char[200] ;	// ���ٿռ�
				len = 0 ;
				while((c=dis.readChar())!='\t'){	// ��������
					temp[len] = c ;
					len ++ ;	// ��ȡ���ȼ�1
				}
				name = new String(temp,0,len) ;	// ���ַ������ΪString
				price = dis.readFloat() ;	// ��ȡ�۸�
				dis.readChar() ;	// ��ȡ\t
				num = dis.readInt() ;	// ��ȡint
				dis.readChar() ;	// ��ȡ\n
				System.out.printf("���ƣ�%s���۸�%5.2f��������%d\n",name,price,num) ;
			}
		}catch(Exception e){}
		dis.close() ;
	}
};