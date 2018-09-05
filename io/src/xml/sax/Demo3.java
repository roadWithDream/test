package xml.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class Demo3 {

	/**
	 * @param args
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		//1、创建解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2、得到解析器
		SAXParser sp = factory.newSAXParser();
		//3、得到读取器
		XMLReader reader = sp.getXMLReader();
		//4、设置内容处理器
		reader.setContentHandler(new TagValueHandler());
		//5、读取文档内容
		reader.parse("src/xml/sax/book.xml");
	}

}
//获取指定标签的值
class BeanListHandler extends DefaultHandler{

	private String currentTag;
	private int needNumber = 1; //想获取第几个标签的值
	private int currentNumber;  // 目前的值
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		if("作者".equals(currentTag) && currentNumber == needNumber){
			
			System.out.println(new String(ch,start,length));
		}
	}

	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		// TODO Auto-generated method stub
	}

	@Override
	public void startElement(String uri, String localName, String name,
			Attributes atts) throws SAXException {
		// TODO Auto-generated method stub
		currentTag = name;
		if("作者".equals(currentTag)){
			currentNumber++;
		}
	}

	
}
