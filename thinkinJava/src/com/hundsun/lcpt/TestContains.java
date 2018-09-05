package com.hundsun.lcpt;

import java.io.File;

public class TestContains {
	public static void main(String agrs[]){
		String s1 = "sdfasdf";
		String s2 = "";
		if(s1.contains(s2)){
			//System.out.println("true");
		}
		
		File f = new File("D:/Files/");
		if(f.isDirectory()){
			System.out.println("true");
		}
	}
}
