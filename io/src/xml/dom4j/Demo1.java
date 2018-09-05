package xml.dom4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Demo1 {
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		add();
	}
	
	public void read() throws DocumentException{
		 SAXReader reader = new SAXReader();
		 Document document = reader.read(new File("src/xml/sax/book.xml"));
		 Element root = document.getRootElement();
		 Element book = (Element)root.elements("书").get(1);
		 String name = book.element("书名").getText();
		 System.out.println(name);
	}
	
	public void readAttr() throws DocumentException{
		 SAXReader reader = new SAXReader();
		 Document document = reader.read(new File("src/xml/sax/book.xml"));
		 
		 Element root = document.getRootElement();
		 Element book = (Element)root.elements("书").get(1);
		 String name = book.element("书名").attributeValue("name");
		 System.out.println(name);
	}
	public static void add() throws DocumentException, Exception{
		 SAXReader reader = new SAXReader();
		 Document document = reader.read(new File("src/xml/sax/book.xml"));
		 
		 Element book = document.getRootElement().element("书");
		 book.addElement("售价").setText("209元");
		 
		 OutputFormat format = OutputFormat.createPrettyPrint();
		 format.setEncoding("GBK");    // 指定XML编码
		 XMLWriter writer = new XMLWriter(new FileWriter("src/xml/dom4j/book.xml"),format);
		 writer.write(document);
		 writer.close();
	}
	
}
