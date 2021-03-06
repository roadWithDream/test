package org.json;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
    	
        String xml = "<class><test>sss</test><student><name>aaaaaa</name><age>21</age></student><student><name>bbbbbb</name><age>22</age></student></class>";
        xml = "<root><ptyybs>ybt</ptyybs><jydm>510015</jydm><jyjg>0053901</jyjg><jyrq>20180330</jyrq><jysj>165105</jysj><jygy>000440</jygy>" +
        		"<jyzd></jyzd><jyqd>6</jyqd><sqgy></sqgy><sqmm>******</sqmm><AccType>1</AccType><Account>1013302583</Account><IdType></IdType><OpenBranch>0060504</OpenBranch>" +
        		"<ywlx>4</ywlx><gsdm>0006</gsdm><bxxx><gsdm>0006</gsdm><tbrq>20180330</tbrq><khjl>000466</khjl><khjlmc></khjlmc><syrgs>0</syrgs><tzzhgs>0</tzzhgs><cpdm>LA12BA</cpdm>" +
        		"<zxbf>50000.00</zxbf><zxbe></zxbe><tbfs></tbfs><jffs>2</jffs><bddsfs>4</bddsfs><xqjffs></xqjffs><qjdkzh>6229934110203654402</qjdkzh><mqjlqfs></mqjlqfs><scjlqfs></scjlqfs>" +
        		"<djbz></djbz><hllqfs></hllqfs><hlfpbj></hlfpbj><jejqbz></jejqbz><tbrlqzh></tbrlqzh><bbrlqzh></bbrlqzh><lqnqlx></lqnqlx><lqnq></lqnq><jfnqlx>2</jfnqlx><jfnx>3</jfnx><bznqlx>1</bznqlx>" +
        		"<bznq>10</bznq><zyjjfs></zyjjfs><zyjjzz></zyjjzz><zdxbbz></zdxbbz><fjxgs>0</fjxgs></bxxx><gsmc>大都会人寿</gsmc><BRANCH>0053901</BRANCH><jgmc>市行营业部</jgmc><pzxx><wdmc>市行营业部</wdmc>" +
        		"<bdysh>201806151001</bdysh><tbdh>201806150001</tbdh><sjhm></sjhm><xsryxm>孙勇</xsryxm><xsrygh>000466</xsrygh><xszgzh></xszgzh></pzxx><jyxx><jyje>50000.00</jyje><jyzh>6229934110203654402</jyzh>" +
        		"</jyxx><sfsqtx></sfsqtx><sqfs></sqfs><xhfs></xhfs><gysj></gysj><gymc></gymc><pzzl>006</pzzl><tbr><circle><amt1>2342</amt1><amt2>2343</amt2></circle><circle><amt1>23423423</amt1><amt2>2344</amt2></circle><xm>吴连荣</xm><xb>0</xb><zjlx>0</zjlx><zjhm>230221196912011929</zjhm><zjsxrq>20100101</zjsxrq>" +
        		"<zjyxzq>20300101</zjyxzq><csrq>19691201</csrq><jtlxdh></jtlxdh><jtlxdz>无锡市旺庄路7号</jtlxdz><jtlxyb>116000</jtlxyb><lxdh></lxdh><lxdz>无锡市旺庄路7号</lxdz><lxyb>116000</lxyb><email></email>" +
        		"<gj>0156</gj><sjhm>15149037771</sjhm><zydm>A002</zydm><tbrnsr>100000.00</tbrnsr><tbrjtnsr>150000.00</tbrjtnsr><jmly>0</jmly><fxcs></fxcs><ybbrgx>3</ybbrgx><dzsfdm></dzsfdm><dzsssdm></dzsssdm>" +
        		"<dzssqxdz></dzssqxdz><sg></sg><tz></tz><hyzk></hyzk><bfys></bfys><jtlxdhqh></jtlxdhqh><gzdw></gzdw><lxdhqh></lxdhqh><tbrhfdh></tbrhfdh></tbr><reserve1></reserve1><bbr><xm>吴连荣</xm><xb>0</xb>" +
        		"<zjlx>0</zjlx><zjhm>230221196912011929</zjhm><zjsxrq>20100101</zjsxrq><zjyxzq>20300101</zjyxzq><csrq>19691201</csrq><gj>0156</gj><lxdh></lxdh><lxdz>无锡市旺庄路7号</lxdz><lxyb>116000</lxyb>" +
        		"<sjhm>15149037771</sjhm><email></email><zydm>A002</zydm><ccdz></ccdz><ccyb></ccyb><dzsfdm></dzsfdm><dzsssdm></dzsssdm><dzssqxdz></dzssqxdz><sg></sg><tz></tz><hyzk></hyzk><jtlxdhqh></jtlxdhqh>" +
        		"<gzdw></gzdw><lxdhqh></lxdhqh><dwdh></dwdh><nsr></nsr></bbr><cpdm>LA12BA</cpdm><cpmc>都会长青年金保险</cpmc><sgbxje></sgbxje><scewzjbf></scewzjbf><qtxx><jkgz>1</jkgz></qtxx><dkxx><dkhth></dkhth>" +
        		"<dkpzh></dkpzh><dkje></dkje><dkqq></dkqq><dkzq></dkzq></dkxx></root>";
        /* 第一种方法，使用JSON-JAVA提供的方法 */
        //将xml转为json
        JSONObject xmlJSONObj = XML.toJSONObject(xml);
        //设置缩进
        String jsonPrettyPrintString = xmlJSONObj.toString(4);
        //输出格式化后的json
        System.out.println(jsonPrettyPrintString);
		FileWriter fw = new FileWriter("d:/Files/study/test/thinkinJava/src/org/json/json.xml");
		fw.write(new String(jsonPrettyPrintString.getBytes("utf-8"),"utf-8"));
        JSONObject js = new JSONObject(jsonPrettyPrintString);
        
        String resultXml = XML.toString(js);
        System.out.println(resultXml);
        
		FileWriter fm = new FileWriter("d:/Files/study/test/thinkinJava/src/org/json/xml.xml");
		fm.write(new String(resultXml.getBytes("utf-8"),"utf-8"));

		fw.close();
		fm.close();
        /* 第二种方法，使用json-lib提供的方法 
        //创建 XMLSerializer对象
        XMLSerializer xmlSerializer = new XMLSerializer();
        //将xml转为json（注：如果是元素的属性，会在json里的key前加一个@标识）
        String result = xmlSerializer.read(xml).toString();
        //输出json内容
        System.out.println(result);
 */
    }

}