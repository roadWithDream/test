package com.util.desc;

public class DESEncryptImpl implements IEncrypt{

	/**
	 * ����
	 */
	public String dec(String str) {
		return DES.dec(str, "HsAndMoe");
		
	}

	/**
	 *����
	 */
	public String enc(String str) {
		return DES.enc(str, "HsAndMoe");
	}
}
