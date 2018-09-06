package proxy.reflect;

import java.lang.reflect.Constructor;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        Person per = new Person() ; // 正着操作
        System.out.println(per.getClass().newInstance().setName("per").getName());   // 反着来
        
        Class<?> cls0 = per.getClass();
        Object obj0 = cls0.newInstance();
        Person per0 = (Person)obj0;
        System.out.println(per0.setName("per0").getName());
        
        Class<?> cls = Class.forName("proxy.reflect.Person") ; 
        Object obj = cls.newInstance();
        Person per1 = (Person)obj; 
        System.out.println(per1.setName("per1").getName());
        
        Constructor<?> cons = cls.getConstructor();
        Object obj1 = cons.newInstance(); 
        per1 = (Person)obj1;
        System.out.println(per1.setName("per1.1").getName());
        
        Class<?> cls2 = per.getClass() ; // 取得Class对象
        Object obj2 = cls2.newInstance();   // 实例化对象，和使用关键字new一样
        Person per2 = (Person)obj2;  // 向下转型
        System.out.println(per2.setName("per2").getName());  // 反着来

    }
}
