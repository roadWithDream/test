package testaop;

import org.junit.Test;

public class SimpleAOPTest {
	   @Test
	    public void getProxy() throws Exception {
	        // 1. ����һ�� MethodInvocation ʵ����
	        MethodInvocation logTask = new MethodInvocationImpl(); 
	        
	        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();
	        
	        // 2. ����һ�� Advice
	        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);
	        
	        // 3. ΪĿ��������ɴ���
	        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(helloServiceImpl,beforeAdvice);
	        
	        helloServiceImplProxy.sayHelloWorld();
	    }
}