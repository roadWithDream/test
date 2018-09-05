package com.util.desc;

public class desc {
	
	public static void main(String[] args) {
		DESEncryptImpl aa=new DESEncryptImpl();
		String a=aa.enc("111");
		System.out.println(a);
		System.out.println(aa.dec(a));
	 
	}
}


