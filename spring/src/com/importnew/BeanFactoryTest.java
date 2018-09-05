package com.importnew;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import junit.framework.TestCase;

@SuppressWarnings("deprecation")
public class BeanFactoryTest extends TestCase {
	
    public static void main(String[] args) throws IOException {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        Resource resource = new ClassPathResource("Beans.xml");
        
        System.out.println(resource.getURL());
        System.out.println(resource.getURI());
        System.out.println(((ClassPathResource) resource).getPath());
        System.out.println(resource.lastModified());
        HelloWorld hw = (HelloWorld) bf.getBean("helloWorld");
        
        InputStream inputStream = resource.getInputStream();
        
        int size = inputStream.available();
        
        for(int i=0; i< size; i++){
        	System.out.print((char)inputStream.read() + "");
        }
        System.out.println(inputStream.toString());
        System.out.println(hw.getMessage());
        
        Resource resourceTest = new ClassPathResource("test.xml");
        
        InputStream inputStreamTest = resourceTest.getInputStream();
        System.out.println(inputStreamTest.available());
        
        for(int i=0; i< inputStreamTest.available(); i++){
        	System.out.print((char)inputStreamTest.read() + "");
      }
        
        
        //assertEquals("Hello World",hw.getMessage());
    }
}







