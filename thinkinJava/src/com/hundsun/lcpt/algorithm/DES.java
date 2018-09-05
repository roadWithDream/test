/********************************************
 * 文件名称: DES.java
 * 系统名称: 综合理财系统
 * 模块名称:
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 开发人员: Administrator
 * 开发时间: 2010-5-15 下午08:23:16
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期    修改人员    修改说明
 *********************************************/

package com.hundsun.lcpt.algorithm;

import java.io.UnsupportedEncodingException;

public class DES {
	  
	  /**
	   * DES加密
	   * @param encStr 需要加密的串
	   * @param key    密钥
	   * @return
	   * 
	   */
	  public static String enc(String encStr,String key){    //加密一段文本串
		
    	  if(encStr==null || encStr.length()==0){   //如果为null或者空则加密对0x00处理
			  byte [] b={0x00};
    		  encStr =new String(new String(b));        //如果为空则返回空
    	  }
		DESEncryptor  enc=new DESEncryptor(key.getBytes());
		String s1 = "";
		try {
			s1 = byte2hex( enc.encrypt(encStr.getBytes("utf-8")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s1;
		
	  }
      /**
       * DES解密
       * @param desStr 需要解密的串
       * @param key    密钥
       * @return
       */
      public static String dec(String desStr,String key){    //加密一段文本串
  		
    	 if(desStr==null || desStr.length()==0){   //如果为null或者空则返回空串
			return new String();             //跟unix端c一致
    	 }
		
    	 DESEncryptor  dec=new DESEncryptor(key.getBytes());
	     byte decByte[]=dec.decrypt(hex2byte(desStr));
	     
	     return byte2string(decByte);

      }
      
	  /**
	   * 由于java字符串没有结束符号,去掉0x00后转换成字符串
	   * @param decByte
	   * @return
	   */
      public  static String  byte2string(byte[] decByte){
    	 int len=0;
    	 String src = "";
    	  for(int i=0;i<decByte.length;i++,len++){  //将结束符号0x00的去掉，然后再转成字符串，

 	    	 if(decByte[i]==0x00){
 	    		 len=i;
 	    		 break;
 	    	 }
 	     }
 	     try {
 	    	 
			src = (len==0?new String():new String(decByte,0,len,"utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return src;
      }
      
	 /**
	  * 字节数组转换成16进制字符串
	  * @param b
	  * @return
	  */
	  public static String byte2hex(byte[] b) {//二行制转字符串
	        String hs="";
	        String stmp="";
	        
	              
	        for (int n=0;n<b.length;n++) {
	            stmp=byteHEX(b[n]);
	            hs=hs+stmp;
	        }
	        return hs;
	    }
	  
	  /**
	   * 
	   * @param ib
	   * @return
	   */
	  public static String byteHEX(byte ib) {
          char[] Digit = { '0','1','2','3','4','5','6','7','8','9',
          'A','B','C','D','E','F' };
          char [] ob = new char[2];
          ob[0] = Digit[(ib >>> 4) & 0X0F];
          ob[1] = Digit[ib & 0X0F];
          String s = new String(ob);
          return s;
      }
	  
	  
	  /**
	   * 16进制字符串转换成字节数组
	   * @param hex
	   * @return
	   */
	  public static byte[] hex2byte(String hex) {
		    int len = (hex.length() / 2);
		    byte[] result = new byte[len];
		    char[] achar = hex.toCharArray();
		    for (int i = 0; i < len; i++) {
		     int pos = i * 2;
		     result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
		    }
		    return result;
		}
        
	  /**
         * 
         * @param c
         * @return
         */
		private static byte toByte(char c) {
		    byte b = (byte) "0123456789ABCDEF".indexOf(c);
		    return b;
		}
	  
}
