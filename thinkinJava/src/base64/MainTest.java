package com.cpic.auap.third.util;


import com.alibaba.fastjson.JSONObject;
import com.cpic.auap.third.model.base.InterfaceConetnt;
import com.cpic.auap.third.model.base.InterfaceHead;
import com.cpic.auap.third.model.base.vehicleModelQuery.VehicleModelQueryReq;
import com.cpic.auap.third.model.base.vehicleModelQuery.VehicleModelQueryReqContent;


public class MainTest {

	// 公钥
	static String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCJGg0UQ9L/XqIYKR/QmaBMLajba6lsLeyBkqqgjiGDoaXSWBFA8Pjc86GqwCo+L3HUpSjq1sLQPbB5UYI3+XlkmmxOVduCe65uDcETE59bs8vIFAkEib6Onj3pchZm/hViqM2CWoWHpRnjMBM8YuViNw0YU6bP2g+AfoVQGkemqwIDAQAB";
	// 私钥
	static String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIkaDRRD0v9eohgpH9CZoEwtqNtrqWwt7IGSqqCOIYOhpdJYEUDw+NzzoarAKj4vcdSlKOrWwtA9sHlRgjf5eWSabE5V24J7rm4NwRMTn1uzy8gUCQSJvo6ePelyFmb+FWKozYJahYelGeMwEzxi5WI3DRhTps/aD4B+hVAaR6arAgMBAAECgYBFFVJn1rE4KnglEnvMgcyq9gry3XIWZ6GXvM6rblLm4AoNToELJyFPPJhG0OO4R/Hkw4A1rRenFJ6a0v55tAR9ddMJEf2dhec0j+5G2oBV0UYaWn4y5aCiS+hvzFSP5016SYN+3f9BISh1qEXAMP7sIbYy4G7PX7LDtobIcwiV2QJBANKzqCcUlknEzxUBhZN7uiFtXGc05tFi6M2gH+5MEZsFdURCdvU34Zw/ClZVpzlrt8L1YIH+v5u0kavgc8m2jucCQQCmk7AHHJKJfbEOcqUled8ghWLLVD+tDxh5HKVgQGmu5hWSg+ThDODQ7RbgtOONz40ZTeynI2Tun39oBkZLzIWdAkEAl/4Zkvd64oQijhim7xkVz/8/5QN4bhtXrN2RqykcmiN50F/RyFsjWL7xCg6HrxhRW0X+9Ed8mSnM25vyatRSiQJAdryRXhBc18qTecP4ugTsKmdJ67urA/XdsP7dVwWzD2uMdvqzHEQswGAvzY7DIWOPpTjpdp4BJSLmE0VduEwZ9QJAPjYSycoO/cmhipXHpKGWJ1Nhj5kRtuvWaTe4a/rPmIeI09M/tYiBxC9OzKMG7XjqBpR7JifTgBtQE5S3pL/zfA==";

	// 公钥 、合作伙伴
	static String thirdPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCJGg0UQ9L/XqIYKR/QmaBMLajba6lsLeyBkqqgjiGDoaXSWBFA8Pjc86GqwCo+L3HUpSjq1sLQPbB5UYI3+XlkmmxOVduCe65uDcETE59bs8vIFAkEib6Onj3pchZm/hViqM2CWoWHpRnjMBM8YuViNw0YU6bP2g+AfoVQGkemqwIDAQAB";
	// 私钥、合作伙伴
	static String thirdPrivateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIkaDRRD0v9eohgpH9CZoEwtqNtrqWwt7IGSqqCOIYOhpdJYEUDw+NzzoarAKj4vcdSlKOrWwtA9sHlRgjf5eWSabE5V24J7rm4NwRMTn1uzy8gUCQSJvo6ePelyFmb+FWKozYJahYelGeMwEzxi5WI3DRhTps/aD4B+hVAaR6arAgMBAAECgYBFFVJn1rE4KnglEnvMgcyq9gry3XIWZ6GXvM6rblLm4AoNToELJyFPPJhG0OO4R/Hkw4A1rRenFJ6a0v55tAR9ddMJEf2dhec0j+5G2oBV0UYaWn4y5aCiS+hvzFSP5016SYN+3f9BISh1qEXAMP7sIbYy4G7PX7LDtobIcwiV2QJBANKzqCcUlknEzxUBhZN7uiFtXGc05tFi6M2gH+5MEZsFdURCdvU34Zw/ClZVpzlrt8L1YIH+v5u0kavgc8m2jucCQQCmk7AHHJKJfbEOcqUled8ghWLLVD+tDxh5HKVgQGmu5hWSg+ThDODQ7RbgtOONz40ZTeynI2Tun39oBkZLzIWdAkEAl/4Zkvd64oQijhim7xkVz/8/5QN4bhtXrN2RqykcmiN50F/RyFsjWL7xCg6HrxhRW0X+9Ed8mSnM25vyatRSiQJAdryRXhBc18qTecP4ugTsKmdJ67urA/XdsP7dVwWzD2uMdvqzHEQswGAvzY7DIWOPpTjpdp4BJSLmE0VduEwZ9QJAPjYSycoO/cmhipXHpKGWJ1Nhj5kRtuvWaTe4a/rPmIeI09M/tYiBxC9OzKMG7XjqBpR7JifTgBtQE5S3pL/zfA==";

	
	// 测试方法入口
	public static void main(String[] args) throws Exception {
		System.out.println("privateKey:" + privateKey.length());
		System.out.println("publicKey:" + publicKey.length());
		// 加密方法
		SignAndDecrypt();
		// 解密方法
		checkSignAndDecrypt();
	}

	// 加密方法
	private static void SignAndDecrypt() throws Exception {
		// String requestJson = "{\"bizContent\":{\"interfaceHead\":{\"requestNo\":\"5b72f1c3-8f7a-4ebd-94b2-7d30e1bc91ee\"},\"vehicleModelQueryReq\":{\"vehicleBrandModelKey\":\"大众\"}},\"charset\":\"UTF-8\",\"format\":\"json\",\"inscompanyCode\":\"\",\"serviceCode\":\"insurance.quote\",\"signContent\":\"\",\"signType\":\"RSA\",\"thirdCode\":\"100265\",\"timestamp\":\"20160616170955387\"}";
		String requestJson = vehicleModelQueryReq();
		JSONObject requsetObject = JSONObject.parseObject(requestJson);
		String bizContent = requsetObject.getString("bizContent");
		// 加密、加签
		String signContent = SignatureUtils.encryptAndSign(thirdPublicKey, privateKey,requestJson, true, true);
		System.out.println("加密A加签后报文：" + signContent);
	}

	private static void checkSignAndDecrypt() throws Exception {
		// 实际明文
		String str = "{\"bizContent\":{\"interfaceHead\":{\"requestNo\":\"04ab78b0-7f9e-4e47-957b-0adb0875fe1b\"},\"responseCode\":\"0000\",\"responseMsg\":\"处理成功!\",\"vehicleModelQueryRes\":{\"totalCount\":\"1\",\"vehicleModelInfoList\":[{\"vehicleFamily\":\"车系123\"}]}},\"charset\":\"UTF-8\",\"format\":\"json\",\"inscompanyCode\":\"\",\"serviceCode\":\"insurance.quote\",\"signContent\":\"\",\"signType\":\"RSA\",\"thirdCode\":\"100265\",\"timestamp\":\"20160616170955387\"}";
		// 密文
		String responseJson = "{\"timestamp\":\"20160616170955387\",\"thirdCode\":\"100265\",\"bizContent\":\"ejfOKFTn0bhXRlULW4K5kjkLBDaaIhs0sZHOUWOEWNKsP9gmLP/xnSmEkax7pio5P4GAD/wXql5jN7PkbsE/oTGzB1Ben1I7VIr7NKyyKUqTiM8fzacbtnfkgWEyVNFMbh0WDTKZctNWCyRvgbH/CXGkrAAQ+cZ4Ol56Yq9Uu8Mams0XEwOBTucpJdxVkxD6uI3NZGOiaRrLf9mmyyAbjBP3tn2sEGBX00Z6KAZ1sd9BLlajhwMLPn12/N1KexlRX9JuI2B/c3ImxlXQorEE3Kc3KLU8Rx0UsP9bmBaNcuH+2osWI61mMBMhP26PnTaQlZ4I34DvuHrV++fKFN67gQ==\",\"inscompanyCode\":\"\",\"signType\":\"RSA\",\"signContent\":\"FRyUlfN0Uhhk/+l+C6LqYIoPjI71PwdTBbDQHsgU8KB5bA+oGtQW0UyM4vLX8heAzHwyEEDJCxnykcg4ZPBJa6/OLEve39+Yrjz/YfBSgExY7VS9Gd6iL7RSGWwlnsSviGR3+8NtICszzKh0RzpMksfrNhVyLziUtZBLedBwTio=\",\"serviceCode\":\"insurance.quote\",\"charset\":\"UTF-8\",\"format\":\"json\"}";
		// 解密
		String response = SignatureUtils.checkSignAndDecrypt(responseJson, thirdPublicKey, privateKey, true, true);
		System.out.println("解密后报文：" + response);
	}

	// 封装[车型查询]请求报文
	public static String vehicleModelQueryReq() {

		InterfaceConetnt ic = new InterfaceConetnt();
		ic.setServiceCode("insurance.quote");
		ic.setSignType("RSA");
		ic.setCharset("UTF-8");
		ic.setFormat("json");
		ic.setTimestamp("20160616170955387");
		ic.setThirdCode("100265");
		ic.setInscompanyCode("");

		// 车型查询请求内容
		VehicleModelQueryReqContent reqContent = new VehicleModelQueryReqContent();
		InterfaceHead head = new InterfaceHead();
		head.setRequestNo(java.util.UUID.randomUUID().toString());
		reqContent.setInterfaceHead(head);
		VehicleModelQueryReq cmq = new VehicleModelQueryReq();
		cmq.setVehicleBrandModelKey("大众");
		reqContent.setVehicleModelQueryReq(cmq);
		String bizContent = JSONObject.toJSONString(reqContent);
		ic.setBizContent(bizContent);

		// 封装签名
		ic.setSignContent("");
		// 转换为字符串
		String jsonStr = JSONObject.toJSONString(ic);
		System.out.println("车型查询请求json:" + jsonStr);
		return jsonStr;
	}
}
