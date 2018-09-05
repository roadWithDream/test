package com.util.desc;

public class DES {

	public DES()
    {
    }

    public static String enc(String encStr, String key)
    {
        if(encStr == null || encStr.length() == 0)
        {
            byte b[] = {
                0
            };
            encStr = new String(new String(b));
        }
        DESEncryptor enc = new DESEncryptor(key.getBytes());
        return byte2hex(enc.encrypt(encStr.getBytes()));
    }

    public static String dec(String desStr, String key)
    {
        if(desStr == null || desStr.length() == 0)
        {
            return new String();
        } else
        {
            DESEncryptor dec = new DESEncryptor(key.getBytes());
            byte decByte[] = dec.decrypt(hex2byte(desStr));
            return byte2string(decByte);
        }
    }

    public static String byte2string(byte decByte[])
    {
        int len = 0;
        int i = 0;
        do
        {
            if(i >= decByte.length)
                break;
            if(decByte[i] == 0)
            {
                len = i;
                break;
            }
            i++;
            len++;
        } while(true);
        return len != 0 ? new String(decByte, 0, len) : new String();
    }

    public static String byte2hex(byte b[])
    {
        String hs = "";
        String stmp = "";
        for(int n = 0; n < b.length; n++)
        {
            stmp = byteHEX(b[n]);
            hs = (new StringBuilder()).append(hs).append(stmp).toString();
        }

        return hs;
    }

    public static String byteHEX(byte ib)
    {
        char Digit[] = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
            'A', 'B', 'C', 'D', 'E', 'F'
        };
        char ob[] = new char[2];
        ob[0] = Digit[ib >>> 4 & 15];
        ob[1] = Digit[ib & 15];
        String s = new String(ob);
        return s;
    }

    public static byte[] hex2byte(String hex)
    {
        int len = hex.length() / 2;
        byte result[] = new byte[len];
        char achar[] = hex.toCharArray();
        for(int i = 0; i < len; i++)
        {
            int pos = i * 2;
            result[i] = (byte)(toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
        }

        return result;
    }

    private static byte toByte(char c)
    {
        byte b = (byte)"0123456789ABCDEF".indexOf(c);
        return b;
    }
}
