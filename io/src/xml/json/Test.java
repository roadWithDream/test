package xml.json;
import net.sf.json.xml.*;
public class Test {

    public static void main(String[] args) {
        String xml = "<class id="  
                + "'1'"  
                + "><student><name>aaaaaa</name><age>21</age></student><student><name>bbbbbb</name><age>22</age></student></class>";  
  
        /* ��һ�ַ�����ʹ��JSON-JAVA�ṩ�ķ���  
        //��xmlתΪjson  
        JSONObject xmlJSONObj = XML.toJSONObject(xml);  
        //��������  
        String jsonPrettyPrintString = xmlJSONObj.toString(4);  
        //�����ʽ�����json  
        System.out.println(jsonPrettyPrintString);  
  */ 
        /* �ڶ��ַ�����ʹ��json-lib�ṩ�ķ��� */  
        //���� XMLSerializer����  
        XMLSerializer xmlSerializer = new XMLSerializer();  
        //��xmlתΪjson��ע�������Ԫ�ص����ԣ�����json���keyǰ��һ��@��ʶ��  
        String result = xmlSerializer.read(xml).toString();  
        //���json����  
        System.out.println(result);
    }
}
