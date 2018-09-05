import java.io.* ;
class Send implements Runnable{			// �߳���
	private PipedOutputStream pos = null ;	// �ܵ������
	public Send(){
		this.pos = new PipedOutputStream() ;	// ʵ���������
	}
	public void run(){
		String str = "Hello World!!!" ;	// Ҫ���������
		try{
			this.pos.write(str.getBytes()) ;
		}catch(IOException e){
			e.printStackTrace() ;
		}
		try{
			this.pos.close() ;
		}catch(IOException e){
			e.printStackTrace() ;
		}
	}
	public PipedOutputStream getPos(){	// �õ����̵߳Ĺܵ������
		return this.pos ;	
	}
};
class Receive implements Runnable{
	private PipedInputStream pis = null ;	// �ܵ�������
	public Receive(){
		this.pis = new PipedInputStream() ;	// ʵ����������
	}
	public void run(){
		byte b[] = new byte[1024] ;	// ��������
		int len = 0 ;
		try{
			len = this.pis.read(b) ;	// ��ȡ����
		}catch(IOException e){
			e.printStackTrace() ;
		}
		try{
			this.pis.close() ;	// �ر�
		}catch(IOException e){
			e.printStackTrace() ;
		}
		System.out.println("���յ�����Ϊ��" + new String(b,0,len)) ;
	}
	public PipedInputStream getPis(){
		return this.pis ;
	}
};
public class PipedDemo{
	public static void main(String args[]){
		Send s = new Send() ;
		Receive r = new Receive() ;
		try{
			s.getPos().connect(r.getPis()) ;	// ���ӹܵ�
		}catch(IOException e){
			e.printStackTrace() ;
		}
		new Thread(s).start() ;	// �����߳�
		new Thread(r).start() ;	// �����߳�
	}
};