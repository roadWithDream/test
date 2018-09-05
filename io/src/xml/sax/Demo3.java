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
		//1��������������
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2���õ�������
		SAXParser sp = factory.newSAXParser();
		//3���õ���ȡ��
		XMLReader reader = sp.getXMLReader();
		//4���������ݴ�����
		reader.setContentHandler(new TagValueHandler());
		//5����ȡ�ĵ�����
		reader.parse("src/xml/sax/book.xml");
	}

}
//��ȡָ����ǩ��ֵ
class BeanListHandler extends DefaultHandler{

	private String currentTag;
	private int needNumber = 1; //���ȡ�ڼ�����ǩ��ֵ
	private int currentNumber;  // Ŀǰ��ֵ
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		if("����".equals(currentTag) && currentNumber == needNumber){
			
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
		if("����".equals(currentTag)){
			currentNumber++;
		}
	}

	
}
