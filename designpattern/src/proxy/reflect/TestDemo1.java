package proxy.reflect;

import java.lang.reflect.Method;

public class TestDemo1 {
    public static void main(String[] args) throws Exception {
        
        Class<?> cls = Class.forName("proxy.reflect.Person") ; 
        Object obj = cls.newInstance();
        
        String attribute = "name" ; // 要调用类之中的属性
        Method setMet = cls.getMethod("set" + initcap(attribute), String.class);// setName()
        Method getMet = cls.getMethod("get" + initcap(attribute));// getName()
        setMet.invoke(obj, "张三") ; // 等价于：Person对象.setName("张三")
        System.out.println(getMet.invoke(obj));// 等价于：Person对象.getName()
    }
    public static String initcap(String str) {
        return str.substring(0,1).toUpperCase().concat(str.substring(1)) ;
    }


}
