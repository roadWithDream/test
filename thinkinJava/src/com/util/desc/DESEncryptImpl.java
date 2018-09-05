package com.util.desc;

public class DESEncryptImpl implements IEncrypt{

	/**
	 * Ω‚√‹
	 */
	public String dec(String str) {
		return DES.dec(str, "HsAndMoe");
		
	}

	/**
	 *º”√‹
	 */
	public String enc(String str) {
		return DES.enc(str, "HsAndMoe");
	}
}
