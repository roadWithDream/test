import java.io.InputStream ;
public class SystemDemo05{
	public static void main(String args[]) throws Exception {	// 所有异常抛出
		InputStream input = System.in ;	// 从键盘接收数据
		StringBuffer buf = new StringBuffer() ;	// 使用StringBuffer接收数据
		System.out.print("请输入内容：") ;	// 提示信息
		int temp = 0 ;		// 接收内容
		while((temp=input.read())!=-1){
			char c = (char) temp ;	// 将数据变为字符
			if(c=='\n'){	// 退出循环，输入回车表示输入完成
				break ;
			}
		}
		System.out.println("输入的内容为：" + buf) ;
		input.close() ;	// 关闭输入流
	}
};